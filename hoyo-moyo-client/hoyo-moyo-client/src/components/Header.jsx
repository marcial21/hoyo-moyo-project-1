import logo from "../assets/logo.png"
import { useNavigate } from 'react-router-dom'
import './Header.css'; // For styling


const Header = () => {
  
  const navigate = useNavigate();

  const handleLogoClick = () => {
      navigate('/');
    };

  const handleInventoryClick = () => {
    navigate('/inventory/characterInventory');
  }

  const handleWarehouseClick = () => {
    navigate('/warehouses')
  }

  return (
    <header className="header">
        <button className='logo-button' onClick={handleLogoClick}>
            <img src={logo} alt="Logo" className="logo" />
        </button>

      <div className="button-group">
        <button className="inventory-button" onClick={handleInventoryClick}>Inventory</button>
        <button className="warehouses-button" onClick={handleWarehouseClick}>
          Warehouses
        </button>
      </div>
    </header>
  );
};

export default Header;