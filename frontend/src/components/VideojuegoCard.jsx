export default function VideojuegoCard({ juego }) {

  return (
    <div className="card">
      <h2>{juego.titulo}</h2>
      <p>
        <strong>Plataforma:</strong> {juego.plataforma}
      </p>
      <p>
        <strong>Favorito:</strong>{' '}
        <span className={juego.favorito ? 'favorite' : ''}>
          {juego.favorito ? 'Sí' : 'No'}
        </span>
      </p>
      <p>
        <strong>Género:</strong> {juego.genero?.nombre}
      </p>
    </div>
  )
}