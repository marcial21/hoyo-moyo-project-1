import './ModificationOptions.css'


const handleAddClick = () => {
    // Handle the click event, e.g., navigate to a different page
    alert('Characters clicked!');
  };

const handleUpdateClick = () => {
    alert('Warehouses clicked!');
}

const handleDeletesClick = () => {
  alert('Artifacts Clicked')
}

const ModifcationOptions = () => {
    return (
      <header className="modificationOptions">
        <div className="modification-button-group">
          <button className="add-button" onClick={handleAddClick}>Add</button>
          <button className="update-button" onClick={handleUpdateClick}>Update</button>
          <button className="delete-button" onClick={handleDeletesClick}>Delete</button>
        </div>
      </header>
    );
  };


export default ModifcationOptions;