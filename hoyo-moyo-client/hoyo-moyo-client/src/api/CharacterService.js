export const fetchCharacters = async () => {
    try {
      const response = await fetch('http://localhost:8080/characters');
      if (!response.ok) {
        throw new Error('Network response was not ok');
      }
      const data = await response.json();
      return data;
    } catch (error) {
      console.error('Error fetching chracters:', error);
      return [];
    }
  };

export const fetchCharactersByWarehouse = async (warehouseId) => {
try {
  console.log("this is whats being sent ->", warehouseId);
    const response = await fetch('http://localhost:8080/characters/warehouseId/'+ warehouseId);
    if (!response.ok) {
    throw new Error('Network response was not ok');
    }
    const data = await response.json();
    return data;
} catch (error) {
    console.error('Error fetching chracters:', error);
    return [];
}
};