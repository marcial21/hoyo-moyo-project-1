import axios from 'axios';

export const fetchWarehouses = async () => {
    try {
      const response = await fetch('http://localhost:8080/warehouses');
      if (!response.ok) {
        throw new Error('Network response was not ok');
      }
      const data = await response.json();
      return data;
    } catch (error) {
      console.error('Error fetching warehouses:', error);
      return [];
    }
  };
  
  export const addWarehouse = async (warehouse) => {
    try {
      console.log("Now invoking POST")
      console.log("This is the body that will be sent: ", JSON.stringify(warehouse))
      const response = await fetch('http://localhost:8080/warehouses', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json',
        },
        body: '{ "name" : '+JSON.stringify(warehouse) + '}',
      });
      if (!response.ok) {
        throw new Error('Network response was not ok');
      }
      const data = await response.json();
      return data; // Assuming data is the newly added warehouse
    } catch (error) {
      console.error('Error adding warehouse:', error);
      return null;
    }
  };


  export const deleteWarehouse = async (id) => {
    console.log("Calling the delete endpoint with -> ", id);
    try {
      await axios.delete(`http://localhost:8080/warehouses/${id}`);
    } catch (error) {
      console.error('Error deleting warehouse:', error);
      throw error;
    }
  };

  export const updateWarehouse = async (id, updatedData) => {
    console.log("calling the put endpoint")
    try {
      const response = await axios.put(`${API_BASE_URL}/warehouses/${id}`, updatedData);
      return response.data;
    } catch (error) {
      console.error('Error updating warehouse:', error);
      throw error;
    }
  };