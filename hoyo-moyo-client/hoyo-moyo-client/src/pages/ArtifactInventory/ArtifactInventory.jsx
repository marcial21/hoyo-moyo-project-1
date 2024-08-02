import Header from '../../components/Header'
import InventoryOptions from '../../components/InventoryOptions';
import List from '../../components/List'

import './ArtifactInventory.css'

const ArtifactItems = [
  'Artifact 1',
  'Artifact 2',
  'Artifact 3',
];

export const ArtifactInventory = () => {
    return (
    <div className="artifactInventory">
      <Header />
      <InventoryOptions />
      <main>
        <List items={ArtifactItems} /> {}
      </main>
    </div>
    )
}