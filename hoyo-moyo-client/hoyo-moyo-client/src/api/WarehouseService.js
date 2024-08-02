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
  