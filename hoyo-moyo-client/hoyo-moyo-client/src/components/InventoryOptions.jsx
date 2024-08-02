import './InventoryOptions.css'


const handleChracterClick = () => {
    // Handle the click event, e.g., navigate to a different page
    alert('Characters clicked!');
  };

const handleWeaponseClick = () => {
    alert('Warehouses clicked!');
}

const handleArtifactsClick = () => {
  alert('Artifacts Clicked')
}

const InventoryOptions = () => {
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