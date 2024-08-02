import { addWarehouse, deleteWarehouse, updateWarehouse } from '../api/WarehouseService';
import AddWarehouseForm from './forms/AddWarehouseForm';
import './ModificationOptions.css'
import { useState } from 'react'

/**
 * Component used for adding functionality to the Add, Delete and Update buttons. 
 * 
 * @param {*} param0 
 * @returns 
 */
const ModifcationOptions = ( { items }) => {
  const [isFormVisible, setIsFormVisible] = useState(false);
  const [warehouses, setWarehouses] = useState([]);
  const [error, setError] = useState(null);

  const handleAddClick = () => {
    setIsFormVisible(true);
  };

  const handleFormSubmitAdd = async (name) => {
    try {
      const newWarehouse = await addWarehouse(name);
      setIsFormVisible(false); 
      setError(null);
    } catch (error) {
      setError('Error adding warehouse');
    }
  };

  const handleFormSubmitDelete = async (name) => {
    try {
      const newWarehouse = await deleteWarehouse(name);
      setIsFormVisible(false); 
      setError(null); 
    } catch (error) {
      setError('Error deleting warehouse');
    }
  };

  const handleFormSubmitUpdate = async (name) => {
    try {
      const newWarehouse = await updateWarehouse(name);
      setIsFormVisible(false); 
      setError(null);
    } catch (error) {
      setError('Error updating warehouse');
    }
  };

  const handleFormCancelAdd = () => {
    setIsFormVisible(false); 
  };
  const handleFormCancelDelete = () => {
    setIsFormVisible(false); 
  };
  const handleFormCancelUpdate = () => {
    setIsFormVisible(false); 
  };

  const handleUpdateClick = () => {
    setIsFormVisible(true);
  }

  const handleDeletesClick = () => {
    setIsFormVisible(true);
  }
    return (
      <header className="modificationOptions">
        <div className="modification-button-group">
          

        <div>
          <button onClick={handleAddClick}>Add</button>

          {isFormVisible && (
            <AddWarehouseForm
              onSubmit={handleFormSubmitAdd}
              onCancel={handleFormCancelAdd}
            />
          )}
        </div>


        <div>
          <button onClick={handleDeletesClick}>Delete</button>

          {isFormVisible && (
            <AddWarehouseForm
              onSubmit={handleFormSubmitDelete}
              onCancel={handleFormCancelDelete}
            />
          )}
        </div>

        <div>
          <button onClick={handleUpdateClick}>Update</button>

          {isFormVisible && (
            <AddWarehouseForm
              onSubmit={handleFormSubmitUpdate}
              onCancel={handleFormCancelUpdate}
            />
          )}
        </div>

        </div>
      </header>
    );
  };


export default ModifcationOptions;