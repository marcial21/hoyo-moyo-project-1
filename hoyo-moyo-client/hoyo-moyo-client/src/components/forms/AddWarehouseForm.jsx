import { useState } from 'react';

/**
 * Component used for filling forms.
 * 
 * @param {*} param0 
 * @returns 
 */
const AddWarehouseForm = ({ onSubmit, onCancel }) => {
  const [name, setName] = useState('');

  const handleInputChange = (event) => {
    setName(event.target.value);
  };

  const handleAddClick = (event) => {
    event.preventDefault();
    onSubmit(name);
    setName(''); 
  };

  return (
    <form onSubmit={handleAddClick}>
      <label>
        Name:
        <input
          type="text"
          value={name}
          onChange={handleInputChange}
          required
        />
      </label>
      <button type="submit">Submit</button>
      <button type="button" onClick={onCancel}>Cancel</button>
    </form>
  );
};

export default AddWarehouseForm;
