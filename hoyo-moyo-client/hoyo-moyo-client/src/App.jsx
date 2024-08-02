import './App.css'
import { BrowserRouter, Routes, Route, Link, Navigate } from 'react-router-dom'
import { Home } from './pages/home/Home'
import { Error } from './pages/error/Error'
import { Warehouse } from './pages/warehouses/Warehouse';
import { CharacterInventory } from './pages/CharacterInventory/CharacterInventory';
import { WeaponInventory } from './pages/WeaponInventory/WeaponInventory';
import { ArtifactInventory } from './pages/ArtifactInventory/ArtifactInventory';

const App = () => {
  return (
    <BrowserRouter>
    <Routes>
      <Route path="/" element={<Home />}/>
      <Route path="/warehouses" element={<Warehouse />} />
      <Route path="/inventory/characterInventory" element={<CharacterInventory />} />
      <Route path="/inventory/weaponInventory" element={<WeaponInventory />} />
      <Route path="/inventory/artifactInventory" element={<ArtifactInventory />} />
      <Route path='*' element={<Error/>}/>
    </Routes>
    </BrowserRouter>
  );
};

export default App;

