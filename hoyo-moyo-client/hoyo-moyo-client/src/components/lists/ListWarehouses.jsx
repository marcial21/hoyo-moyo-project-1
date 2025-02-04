import { fetchCharactersByWarehouse } from '../../api/CharacterService';
import './ListWarehouses.css'; 
import { useState } from 'react';

/**
 * Component used to iterate through the list of available warehouses with some features. 
 * 
 * @param {*} param0 
 * @returns 
 */
const ListWarehouses = ({ items }) => {
  if (!Array.isArray(items)) {
    return <p>No items to display</p>;
  }

  const [characters, setCharacters] = useState([]); 
  const [error, setError] = useState(null);

  const handleButtonClick = async (warehouseId) => {
    try {
      const data = await fetchCharactersByWarehouse(warehouseId);
      if (Array.isArray(data)) {
        setCharacters(data); 
      } else {
        setError('No characters found for the warehouse.');
      }
    } catch (error) {
      setError('Error fetching characters.');
    }
  };

  return (
    <div>
      {characters.length > 0 && (
        <div className="characters-list">
          <h2>Characters</h2>
          <ul>
            {characters.map(character => (
              <li key={character.id}>
                {character.name} level:{character.level} <br/> {character.description} 
                <br/>Element: {character.element} <br/> HP: {character.hp} <br/> ATK: {character.atk} <br/> DEF: {character.def}
                <br/> Serial: {character.characterId}
              </li>
            ))}
          </ul>
        </div>
      )}
  {error && <p className="error-message">{error}</p>}
    <div className="lbutton-list">
      {items.map(item => (
        <button
          key={item.warehouseId}
          className="warehouse-button"
          onClick={() => handleButtonClick(item.warehouseId)}
        >
          {item.name}
        </button>
      ))}
    </div>    
</div>
  );
};


export default ListWarehouses;
