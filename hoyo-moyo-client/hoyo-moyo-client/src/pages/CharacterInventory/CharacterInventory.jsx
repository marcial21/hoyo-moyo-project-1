import Header from '../../components/Header'
import InventoryOptions from '../../components/InventoryOptions';
import List from '../../components/List'

import './CharacterInventory.css'

const characterItems = [
  'Venti',
  'Zhongli',
  'Raiden Shogun',
  // Add more items as needed
];

export const CharacterInventory = () => {
    return (
    <div className="characterInventory">
      <Header />
      <InventoryOptions />
      <main>
        <List items={characterItems} /> {/* Always show the list */}
      </main>
    </div>
    )
}