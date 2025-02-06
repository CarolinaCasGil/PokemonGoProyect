# 🐾 Pokémon Project

This project is a simplified Pokémon adventure simulation where players can choose their initial Pokémon, explore the world, battle, and capture new Pokémon. Additionally, the added Pokémon are inspired by famous characters, and their attacks are related to their lives, which adds a fun and unique touch to the game.

---

## 🎮 How to Play
1. **Choose Initial Pokémon**  
   At the beginning, the player chooses their first Pokémon to start the adventure.
2. **Exploration**  
   The player "walks" through the Pokémon world and may encounter wild Pokémon.
3. **Wild Pokémon Encounters**  
   When encountering a wild Pokémon, the player has two options:  
   - **Battle**: Fight the Pokémon using attacks.  
   - **Flee**: Escape from the encounter.
4. **Combat**  
   If the player chooses to battle, there are two options:  
   - **Fight**: Use the specific attacks of their Pokémon.  
   - **Capture**: Try to capture the wild Pokémon.
5. **Pokémon Capture**  
   - **3 capture attempts** are made randomly.  
   - If successful, the Pokémon is added to the player's collection.  
6. **Managing Captured Pokémon**  
   - The player can view an array showing all the captured Pokémon.
7. **Continue or End**  
   - After each encounter, the player can choose whether to continue exploring or end the game.



https://github.com/user-attachments/assets/260ec461-529c-419b-8073-72c59a933455


---

## 🗂️ **Project Structure**
The project is organized into two main packages:

### **1. Domain Package**
Defines the structure and behavior of the Pokémon and other game elements:
- **Pokemon**: Parent class for all Pokémon.
- **Agua**, **Planta**, **Fuego**: Specific classes according to the type of Pokémon.
- **Ataque**: Defines the attacks that Pokémon can perform.
- **Entrenador**: Represents the player.

### **2. Pokemon Package**
Contains the main class with the `main` method that runs the game.

---

## 🔥 **Pokémon and Attacks**
The Pokémon are inspired by famous figures, and their attacks reflect aspects of their lives:

### **Examples**
- 🔥 **Camaron de la Isla** (Fire): **Flamenquito** and **Cigala**
- 🌱 **Rosalía** (Plant): **Motomami** and **Unias**
- 💧 **David Bisbal** (Water): **Flying Kick** and **Yatecomo**

## 🛠️ Requisitos
- **Java JDK 8** o superior.


