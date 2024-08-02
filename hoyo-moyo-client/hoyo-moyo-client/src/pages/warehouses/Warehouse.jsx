import Header from '../../components/Header'
import ModificationOptions from '../../components/ModificationOptions'
import { useEffect, useState } from 'react';
import './Warehouse.css'
import { fetchWarehouses } from '../../api/WarehouseService'
import ListWarehouses from '../../components/lists/ListWarehouses';

export const Warehouse = () => {

    const [warehouses, setWarehouses] = useState([]);
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState(null);

    useEffect(() => {
      const getData = async () => {
        try {
          const warehousesData = await fetchWarehouses();
          setWarehouses(warehousesData);
        } catch (error) {
          setError(error);
        } finally {
          setLoading(false);
        }
      };
  
      getData();
    }, []);

    if (loading) return <p>Loading...</p>;
    if (error) return <p>Error: {error.message}</p>;

    return (
    <div className="warehouse">
      <Header />
      <ModificationOptions />
      <main>
        <ListWarehouses items={warehouses} /> {/* Always show the list */}
      </main>
    </div>
    
    )
}