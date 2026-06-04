import { useEffect, useState } from 'react'
import VideojuegoCard from './components/VideojuegoCard'
import { obtenerVideojuegos } from './services/api'

function App() {
  const [juegos, setJuegos] = useState([])
  
  useEffect(() => {
    const cargarVideojuegos = async () => {
      try {
        const data = await obtenerVideojuegos()
        setJuegos(data)
      } catch (error) {
        console.error(error)
      }
    }
    cargarVideojuegos()
  }, [])

  return (
    <div className="container">
      <h1 className="title">
        Catálogo de Videojuegos
      </h1>
      <div className="grid">
        {
          juegos.map((juego) => (
            <VideojuegoCard
              key={juego.id}
              juego={juego}
            />
          ))
        }
      </div>
    </div>
  )
}

export default App