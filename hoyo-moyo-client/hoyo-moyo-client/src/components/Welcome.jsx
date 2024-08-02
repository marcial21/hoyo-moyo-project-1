import './Welcome.css'; 

/**
 * Component for displaying the welcome messaage of our application. 
 * 
 * @returns 
 */
const Welcome = () => {
  return (
    <main className="welcome-content">
      <h1>Welcome to the HoyoMoyo Warehouse management application!</h1>
      <p>
        This application allows authorized administrators to modify the warehouses of HOYOMOYO corporation. 
        Below are a few keynote features of using the application. 
      </p>
    </main>
  );
};

export default Welcome;
