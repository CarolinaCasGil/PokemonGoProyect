# 🐾 Proyecto Pokemon

Este proyecto es una simulación de una aventura Pokémon simplificada, donde los jugadores pueden elegir su Pokémon inicial, explorar el mundo, combatir y capturar nuevos Pokémon. Además, los Pokémon añadidos están inspirados en personajes famosos, y sus ataques están relacionados con sus vidas, lo que añade un toque divertido y único al juego.

---

## 🎮 Cómo Jugar
1. **Elección de Pokémon Inicial**  
   Al comenzar, el jugador elige su primer Pokémon para iniciar la aventura.
2. **Exploración**  
   El jugador "camina" por el mundo Pokémon y puede encontrar Pokémon salvajes.
3. **Encuentros con Pokémon Salvajes**  
   Al encontrarse con un Pokémon salvaje, el jugador tiene dos opciones:  
   - **Combatir**: Enfrentar al Pokémon usando ataques.  
   - **Huir**: Escapar del encuentro.
4. **Combate**  
   Si el jugador decide combatir, tiene dos posibilidades:  
   - **Luchar**: Usar los ataques específicos de su Pokémon.  
   - **Capturar**: Intentar capturar al Pokémon salvaje.
5. **Captura de Pokémon**  
   - Se realizan **3 intentos de captura** de forma aleatoria.  
   - Si tiene éxito, el Pokémon se añade a la colección del jugador.  
6. **Gestión de Pokémon Capturados**  
   - El jugador puede consultar un array que muestra todos los Pokémon capturados.
7. **Continuar o Finalizar**  
   - Después de cada encuentro, el jugador puede elegir si desea seguir explorando o finalizar el juego.

---

## 🗂️ Estructura del Proyecto
El proyecto está organizado en dos paquetes principales:

### **1. Paquete Dominio**
Define la estructura y comportamiento de los Pokémon y otros elementos del juego:
- **Pokemon**: Clase padre para todos los Pokémon.
- **Agua**, **Planta**, **Fuego**: Clases específicas según el tipo de Pokémon.
- **Ataque**: Define los ataques que pueden realizar los Pokémon.
- **Entrenador**: Representa al jugador.

### **2. Paquete Pokemon**
Contiene la clase principal con el método `main` que ejecuta el juego.

---

## 🔥 Pokémon y Ataques
Los Pokémon están inspirados en figuras famosas, y sus ataques reflejan aspectos de sus vidas:

### **Ejemplos**
- 🔥 **Camaron de la Isla** (Fuego): **Flamenquito** y **Cigala**
- 🌱 **Rosalía** (Planta): **Motomami** y **Unias**
- 💧 **David Bisbal** ("Bisbal"): **Patada voladora** y **Yatecomo**

---

## 🛠️ Requisitos
- **Java JDK 8** o superior.


