import './Header.css'; // For styling
import logo from "../assets/logo.png"

const handleLogoClick = () => {
    // Handle the click event, e.g., navigate to a different page
    alert('Logo clicked!');
  };

const handleWarehouseClick = () => {
    alert('Warehouse clicked!');
}

const handleInventoryClick = () => {
  alert('Inventory Clicked')
}

const Header = () => {
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