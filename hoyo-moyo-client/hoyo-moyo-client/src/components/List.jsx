import './List.css'

/**
 * Component used for creating a list of items. 
 * 
 * @param {*} param0 
 * @returns 
 */
const List = ({ items }) => {
    return (
      <ul className="list">
        {items.map((item, index) => (
          <li key={index} className="list-item">
            {item}
          </li>
        ))}
      </ul>
    );
  };
  
  export default List;