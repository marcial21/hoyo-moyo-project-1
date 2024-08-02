import Header from '../../components/Header'
import InventoryOptions from '../../components/InventoryOptions';
import List from '../../components/List'
import './WeaponInventory.css'

const WeaponItems = [
  'The Stringless',
  'Skyward Harp',
  'Staff of Homa',
];
export const WeaponInventory = () => {
    return (
    <div className="weapnInventory">
      <Header />
      <InventoryOptions />
      <main>
        <List items={WeaponItems} /> {}
      </main>
    </div>
    )
}