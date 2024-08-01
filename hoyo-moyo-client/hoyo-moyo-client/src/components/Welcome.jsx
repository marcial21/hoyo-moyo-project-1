// src/components/Main.jsx
import './Welcome.css'; // For styling

const Welcome = () => {
  return (
    <main className="welcome-content">
      <h1>Welcome to the HoyoMoyo Warehouse management application!</h1>
      <p>
        This application allows authorized administrators to modify the warehouses of HOYOMOYO corporation. 
        Below are a few keynote features of using the application. 
        * Delete items from the warehouses
      </p>
    </main>
  );
};

export default Welcome;
