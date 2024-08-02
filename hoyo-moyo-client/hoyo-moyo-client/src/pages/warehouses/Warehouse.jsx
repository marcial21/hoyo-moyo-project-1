import Header from '../../components/Header'
import List from '../../components/List'
import ModificationOptions from '../../components/ModificationOptions'
import './Warehouse.css'


export const Warehouse = () => {

    const warehouseItems = [
      'Warehouse 1',
      'Warehouse 2',
      'Warehouse 3',
      // Add more items as needed
    ];

    return (
    <div className="warehouse">
      <Header />
      <ModificationOptions />
      <main>
        <List items={warehouseItems} /> {/* Always show the list */}
      </main>
    </div>
    
    )
}