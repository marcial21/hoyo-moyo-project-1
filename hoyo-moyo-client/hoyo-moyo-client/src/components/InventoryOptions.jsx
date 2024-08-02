import { useNavigate } from 'react-router-dom';
import './InventoryOptions.css'

/**
 * Component used for showing our different inventories. 
 * 
 * @returns 
 */
const InventoryOptions = () => {
  const navigate = useNavigate();

  const handleChracterClick = () => {
    navigate('/inventory/characterInventory');
  };

  const handleWeaponseClick = () => {
    navigate('/inventory/weaponInventory');
  }

  const handleArtifactsClick = () => {
    navigate('/inventory/artifactInventory');
  }
    return (
      <header className="inventoryOptions">
        <div className="inventory-button-group">
          <button className="character-button" onClick={handleChracterClick}>Characters</button>
          <button className="weapons-button" onClick={handleWeaponseClick}>Weapons</button>
          <button className="artifact-button" onClick={handleArtifactsClick}>Artifacts</button>
        </div>
      </header>
    );
  };


export default InventoryOptions;