import './Header.css'; // For styling
import logo from "../assets/logo.png"

const handleLogoClick = () => {
    // Handle the click event, e.g., navigate to a different page
    alert('Logo clicked!');
  };

const handleWarehouseClick = () => {
    alert('Warehouse clicked!');
}

const Header = () => {
  return (
    <header className="header">
        <button className='logo-button' onClick={handleLogoClick}>
            <img src={logo} alt="Logo" className="logo" />
        </button>
      <button className="warehouses-button" onClick={handleWarehouseClick}>Warehouses</button>
    </header>
  );
};

export default Header;