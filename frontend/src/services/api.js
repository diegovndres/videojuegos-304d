const API_URL = '/api'

export async function obtenerVideojuegos() {

  const response = await fetch(
    `${API_URL}/videojuegos`
  )

  if (!response.ok) {
    throw new Error('Error al obtener videojuegos')
  }

  return await response.json()
}