
const ListWarehouses = ({ items }) => {
  if (!Array.isArray(items)) {
    return <p>No items to display</p>;
  }

  return (
    <ul>
      {items.map(item => (
        <li key={item.warehouseId}>{item.name}</li>
      ))}
    </ul>
  );
};

export default ListWarehouses;
