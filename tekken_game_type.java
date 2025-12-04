import java.util.Scanner;

// Class -> Blueprint of an anime fighter
// 1. Properties, Constructors, and Functions

class AnimeFighter {

    // Properties
    String name;
    int health;
    int stamina;
    int maxHealth;
    boolean bandageUsed;
    boolean potionUsed;

    // Constructor
    AnimeFighter(String name, int health, int stamina) {
        this.name = name;
        this.health = health;
        this.stamina = stamina;
        this.maxHealth = health;
        this.bandageUsed = false;
        this.potionUsed = false;
        System.out.println(this.name + " enters the arena!");
    }

    // Functions
    void basicAttack(AnimeFighter target) {
        if (target.health <= 0) {
            System.out.println(target.name + " has already been defeated. Basic attack failed.");
            return;
        }

        int damage = 15;
        int staminaGained = 20;
        System.out.println(this.name + " used Basic Attack on " + target.name);
        target.health -= damage;
        if (target.health < 0) {
            target.health = 0; // Prevent negative health
        }
        this.stamina += staminaGained;
        if (this.stamina > 120) {
            this.stamina = 120;
        }
        System.out.println(target.name + "'s current health is at " + target.health + " points.");
        System.out.println(this.name + " gained " + staminaGained + " stamina points.");
        
        if (target.health <= 0) {
            System.out.println(target.name + " has been defeated!");
        }
    }

    void useBandage() {
        if (this.bandageUsed) {
            System.out.println(this.name + " has already used the bandage this round!");
            return;
        }
        int healAmount = 50;
        this.health += healAmount;
        if (this.health > this.maxHealth) {
            this.health = this.maxHealth;
        }
        this.bandageUsed = true;
        System.out.println(this.name + " used a Bandage and restored " + healAmount + " HP!");
        System.out.println(this.name + "'s health is now at " + this.health + "/" + this.maxHealth + " points.");
    }

    void useStaminaPotion() {
        if (this.potionUsed) {
            System.out.println(this.name + " has already used the stamina potion this round!");
            return;
        }
        int staminaAmount = 50;
        this.stamina += staminaAmount;
        if (this.stamina > 120) {
            this.stamina = 120;
        }
        this.potionUsed = true;
        System.out.println(this.name + " used a Stamina Potion and restored " + staminaAmount + " stamina!");
        System.out.println(this.name + "'s stamina is now at " + this.stamina + "/120 points.");
    }

    void resetForNextRound() {
        this.health = this.maxHealth;
        this.stamina = 80;
        this.bandageUsed = false;
        this.potionUsed = false;
    }

    void skill1(AnimeFighter target) {
        if (target.health <= 0) {
            System.out.println(target.name + " has already been defeated. Skill 1 failed.");
            return;
        }
        if (this.stamina < 30) {
            System.out.println(this.name + " does not have enough stamina to use Skill 1.");
            System.out.println(this.name + "'s current stamina is at " + this.stamina + " points.");
        } else {
            if (this.name == "Naruto") {
                int damage = 25;
                int staminaCost = 30;
                System.out.println(this.name + " used Rasengan on " + target.name);
                target.health -= damage;
                this.stamina -= staminaCost;
                if (target.health < 0) {
                    target.health = 0;
                }
                System.out.println(target.name + "'s current health is at " + target.health + " points.");
                System.out.println(this.name + " lost " + staminaCost + " stamina points.");

                if (target.health <= 0) {
                    System.out.println(target.name + " has been defeated!");
                }
            } else if (this.name == "Goku") {
                int damage = 28;
                int staminaCost = 30;
                System.out.println(this.name + " used Kamehameha on " + target.name);
                target.health -= damage;
                this.stamina -= staminaCost;
                if (target.health < 0) {
                    target.health = 0;
                }
                System.out.println(target.name + "'s current health is at " + target.health + " points.");
                System.out.println(this.name + " lost " + staminaCost + " stamina points.");

                if (target.health <= 0) {
                    System.out.println(target.name + " has been defeated!");
                }
            } else if (this.name == "Luffy") {
                int damage = 22;
                int staminaCost = 30;
                System.out.println(this.name + " used Gum-Gum Pistol on " + target.name);
                target.health -= damage;
                this.stamina -= staminaCost;
                if (target.health < 0) {
                    target.health = 0;
                }
                System.out.println(target.name + "'s current health is at " + target.health + " points.");
                System.out.println(this.name + " lost " + staminaCost + " stamina points.");

                if (target.health <= 0) {
                    System.out.println(target.name + " has been defeated!");
                }
            } else if (this.name == "Asta") {
                int damage = 26;
                int staminaCost = 30;
                System.out.println(this.name + " used Black Slash on " + target.name);
                target.health -= damage;
                this.stamina -= staminaCost;
                if (target.health < 0) {
                    target.health = 0;
                }
                System.out.println(target.name + "'s current health is at " + target.health + " points.");
                System.out.println(this.name + " lost " + staminaCost + " stamina points.");

                if (target.health <= 0) {
                    System.out.println(target.name + " has been defeated!");
                }
            } else if (this.name == "Saitama") {
                int damage = 30;
                int staminaCost = 30;
                System.out.println(this.name + " used Consecutive Normal Punches on " + target.name);
                target.health -= damage;
                this.stamina -= staminaCost;
                if (target.health < 0) {
                    target.health = 0;
                }
                System.out.println(target.name + "'s current health is at " + target.health + " points.");
                System.out.println(this.name + " lost " + staminaCost + " stamina points.");

                if (target.health <= 0) {
                    System.out.println(target.name + " has been defeated!");
                }
            } else if (this.name == "Gojo") {
                int damage = 24;
                int staminaCost = 30;
                System.out.println(this.name + " used Cursed Technique Lapse Blue on " + target.name);
                target.health -= damage;
                this.stamina -= staminaCost;
                if (target.health < 0) {
                    target.health = 0;
                }
                System.out.println(target.name + "'s current health is at " + target.health + " points.");
                System.out.println(this.name + " lost " + staminaCost + " stamina points.");

                if (target.health <= 0) {
                    System.out.println(target.name + " has been defeated!");
                }
            }
        }
    }

    void skill2(AnimeFighter target) {
        if (target.health <= 0) {
            System.out.println(target.name + " has already been defeated. Skill 2 failed.");
            return;
        }
        if (this.stamina < 40) {
            System.out.println(this.name + " does not have enough stamina to use Skill 2.");
            System.out.println(this.name + "'s current stamina is at " + this.stamina + " points.");
        } else {
            if (this.name == "Naruto") {
                int damage = 30;
                int staminaCost = 40;
                System.out.println(this.name + " used Shadow Clone Jutsu on " + target.name);
                target.health -= damage;
                this.stamina -= staminaCost;
                if (target.health < 0) {
                    target.health = 0;
                }
                System.out.println(target.name + "'s current health is at " + target.health + " points.");
                System.out.println(this.name + " lost " + staminaCost + " stamina points.");

                if (target.health <= 0) {
                    System.out.println(target.name + " has been defeated!");
                }
            } else if (this.name == "Goku") {
                int damage = 35;
                int staminaCost = 40;
                System.out.println(this.name + " used Spirit Bomb on " + target.name);
                target.health -= damage;
                this.stamina -= staminaCost;
                if (target.health < 0) {
                    target.health = 0;
                }
                System.out.println(target.name + "'s current health is at " + target.health + " points.");
                System.out.println(this.name + " lost " + staminaCost + " stamina points.");

                if (target.health <= 0) {
                    System.out.println(target.name + " has been defeated!");
                }
            } else if (this.name == "Luffy") {
                int damage = 28;
                int staminaCost = 40;
                System.out.println(this.name + " used Gum-Gum Gatling on " + target.name);
                target.health -= damage;
                this.stamina -= staminaCost;
                if (target.health < 0) {
                    target.health = 0;
                }
                System.out.println(target.name + "'s current health is at " + target.health + " points.");
                System.out.println(this.name + " lost " + staminaCost + " stamina points.");

                if (target.health <= 0) {
                    System.out.println(target.name + " has been defeated!");
                }
            } else if (this.name == "Asta") {
                int damage = 32;
                int staminaCost = 40;
                System.out.println(this.name + " used Black Meteorite on " + target.name);
                target.health -= damage;
                this.stamina -= staminaCost;
                if (target.health < 0) {
                    target.health = 0;
                }
                System.out.println(target.name + "'s current health is at " + target.health + " points.");
                System.out.println(this.name + " lost " + staminaCost + " stamina points.");

                if (target.health <= 0) {
                    System.out.println(target.name + " has been defeated!");
                }
            } else if (this.name == "Saitama") {
                int damage = 38;
                int staminaCost = 40;
                System.out.println(this.name + " used Serious Punch on " + target.name);
                target.health -= damage;
                this.stamina -= staminaCost;
                if (target.health < 0) {
                    target.health = 0;
                }
                System.out.println(target.name + "'s current health is at " + target.health + " points.");
                System.out.println(this.name + " lost " + staminaCost + " stamina points.");

                if (target.health <= 0) {
                    System.out.println(target.name + " has been defeated!");
                }
            } else if (this.name == "Gojo") {
                int damage = 30;
                int staminaCost = 40;
                System.out.println(this.name + " used Cursed Technique Reversal Red on " + target.name);
                target.health -= damage;
                this.stamina -= staminaCost;
                if (target.health < 0) {
                    target.health = 0;
                }
                System.out.println(target.name + "'s current health is at " + target.health + " points.");
                System.out.println(this.name + " lost " + staminaCost + " stamina points.");

                if (target.health <= 0) {
                    System.out.println(target.name + " has been defeated!");
                }
            }
        }
    }

    void skill3(AnimeFighter target) {
        if (target.health <= 0) {
            System.out.println(target.name + " has already been defeated. Skill 3 failed.");
            return;
        }
        if (this.stamina < 50) {
            System.out.println(this.name + " does not have enough stamina to use Skill 3.");
            System.out.println(this.name + "'s current stamina is at " + this.stamina + " points.");
        } else {
            if (this.name == "Naruto") {
                int damage = 35;
                int staminaCost = 50;
                System.out.println(this.name + " used Sage Mode Attack on " + target.name);
                target.health -= damage;
                this.stamina -= staminaCost;
                if (target.health < 0) {
                    target.health = 0;
                }
                System.out.println(target.name + "'s current health is at " + target.health + " points.");
                System.out.println(this.name + " lost " + staminaCost + " stamina points.");

                if (target.health <= 0) {
                    System.out.println(target.name + " has been defeated!");
                }
            } else if (this.name == "Goku") {
                int damage = 40;
                int staminaCost = 50;
                System.out.println(this.name + " used Instant Transmission Strike on " + target.name);
                target.health -= damage;
                this.stamina -= staminaCost;
                if (target.health < 0) {
                    target.health = 0;
                }
                System.out.println(target.name + "'s current health is at " + target.health + " points.");
                System.out.println(this.name + " lost " + staminaCost + " stamina points.");

                if (target.health <= 0) {
                    System.out.println(target.name + " has been defeated!");
                }
            } else if (this.name == "Luffy") {
                int damage = 33;
                int staminaCost = 50;
                System.out.println(this.name + " used Gear Third on " + target.name);
                target.health -= damage;
                this.stamina -= staminaCost;
                if (target.health < 0) {
                    target.health = 0;
                }
                System.out.println(target.name + "'s current health is at " + target.health + " points.");
                System.out.println(this.name + " lost " + staminaCost + " stamina points.");

                if (target.health <= 0) {
                    System.out.println(target.name + " has been defeated!");
                }
            } else if (this.name == "Asta") {
                int damage = 37;
                int staminaCost = 50;
                System.out.println(this.name + " used Black Divider on " + target.name);
                target.health -= damage;
                this.stamina -= staminaCost;
                if (target.health < 0) {
                    target.health = 0;
                }
                System.out.println(target.name + "'s current health is at " + target.health + " points.");
                System.out.println(this.name + " lost " + staminaCost + " stamina points.");

                if (target.health <= 0) {
                    System.out.println(target.name + " has been defeated!");
                }
            } else if (this.name == "Saitama") {
                int damage = 45;
                int staminaCost = 50;
                System.out.println(this.name + " used Death Punch on " + target.name);
                target.health -= damage;
                this.stamina -= staminaCost;
                if (target.health < 0) {
                    target.health = 0;
                }
                System.out.println(target.name + "'s current health is at " + target.health + " points.");
                System.out.println(this.name + " lost " + staminaCost + " stamina points.");

                if (target.health <= 0) {
                    System.out.println(target.name + " has been defeated!");
                }
            } else if (this.name == "Gojo") {
                int damage = 35;
                int staminaCost = 50;
                System.out.println(this.name + " used Hollow Purple on " + target.name);
                target.health -= damage;
                this.stamina -= staminaCost;
                if (target.health < 0) {
                    target.health = 0;
                }
                System.out.println(target.name + "'s current health is at " + target.health + " points.");
                System.out.println(this.name + " lost " + staminaCost + " stamina points.");

                if (target.health <= 0) {
                    System.out.println(target.name + " has been defeated!");
                }
            }
        }
    }

    void ultimate(AnimeFighter target) {
        if (target.health <= 0) {
            System.out.println(target.name + " has already been defeated. Ultimate failed.");
            return;
        }
        if (this.stamina < 100) {
            System.out.println(this.name + " does not have enough stamina to use Ultimate.");
            System.out.println(this.name + "'s current stamina is at " + this.stamina + " points.");
        } else {
            if (this.name == "Naruto") {
                int damage = 60;
                int staminaCost = 100;
                System.out.println(this.name + " used Six Paths Sage Mode on " + target.name + "!");
                target.health -= damage;
                this.stamina -= staminaCost;
                if (target.health < 0) {
                    target.health = 0;
                }
                System.out.println(target.name + "'s current health is at " + target.health + " points.");
                System.out.println(this.name + " lost " + staminaCost + " stamina points.");

                if (target.health <= 0) {
                    System.out.println(target.name + " has been defeated!");
                }
            } else if (this.name == "Goku") {
                int damage = 70;
                int staminaCost = 100;
                System.out.println(this.name + " used Ultra Instinct on " + target.name + "!");
                target.health -= damage;
                this.stamina -= staminaCost;
                if (target.health < 0) {
                    target.health = 0;
                }
                System.out.println(target.name + "'s current health is at " + target.health + " points.");
                System.out.println(this.name + " lost " + staminaCost + " stamina points.");

                if (target.health <= 0) {
                    System.out.println(target.name + " has been defeated!");
                }
            } else if (this.name == "Luffy") {
                int damage = 55;
                int staminaCost = 100;
                System.out.println(this.name + " used Gear Fifth on " + target.name + "!");
                target.health -= damage;
                this.stamina -= staminaCost;
                if (target.health < 0) {
                    target.health = 0;
                }
                System.out.println(target.name + "'s current health is at " + target.health + " points.");
                System.out.println(this.name + " lost " + staminaCost + " stamina points.");

                if (target.health <= 0) {
                    System.out.println(target.name + " has been defeated!");
                }
            } else if (this.name == "Asta") {
                int damage = 65;
                int staminaCost = 100;
                System.out.println(this.name + " used Black Asta Devil Union on " + target.name + "!");
                target.health -= damage;
                this.stamina -= staminaCost;
                if (target.health < 0) {
                    target.health = 0;
                }
                System.out.println(target.name + "'s current health is at " + target.health + " points.");
                System.out.println(this.name + " lost " + staminaCost + " stamina points.");

                if (target.health <= 0) {
                    System.out.println(target.name + " has been defeated!");
                }
            } else if (this.name == "Saitama") {
                int damage = 80;
                int staminaCost = 100;
                System.out.println(this.name + " used Serious Series: Serious Punch on " + target.name + "!");
                target.health -= damage;
                this.stamina -= staminaCost;
                if (target.health < 0) {
                    target.health = 0;
                }
                System.out.println(target.name + "'s current health is at " + target.health + " points.");
                System.out.println(this.name + " lost " + staminaCost + " stamina points.");

                if (target.health <= 0) {
                    System.out.println(target.name + " has been defeated!");
                }
            } else if (this.name == "Gojo") {
                int damage = 58;
                int staminaCost = 100;
                System.out.println(this.name + " used Unlimited Void on " + target.name + "!");
                target.health -= damage;
                this.stamina -= staminaCost;
                if (target.health < 0) {
                    target.health = 0;
                }
                System.out.println(target.name + "'s current health is at " + target.health + " points.");
                System.out.println(this.name + " lost " + staminaCost + " stamina points.");

                if (target.health <= 0) {
                    System.out.println(target.name + " has been defeated!");
                }
            }
        }
    }

    void showStats() {
        System.out.println("----- Fighter Stats -----");
        System.out.println("Name: " + this.name);
        System.out.println("Health: " + this.health + "/" + this.maxHealth);
        System.out.println("Stamina: " + this.stamina + "/120");
        System.out.println("Bandage: " + (this.bandageUsed ? "Used" : "Available"));
        System.out.println("Potion: " + (this.potionUsed ? "Used" : "Available"));
        System.out.println("-------------------------");
    }

}

public class tekken_game_type {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("========================================");
        System.out.println("   ANIME FIGHTER - CHARACTER SELECT    ");
        System.out.println("========================================");
        System.out.println();
        
        // Display available characters
        System.out.println("Available Fighters:");
        System.out.println("1. Naruto (HP: 150, Stamina: 80)");
        System.out.println("2. Goku (HP: 160, Stamina: 80)");
        System.out.println("3. Luffy (HP: 145, Stamina: 80)");
        System.out.println("4. Asta (HP: 155, Stamina: 80)");
        System.out.println("5. Saitama (HP: 170, Stamina: 80)");
        System.out.println("6. Gojo (HP: 150, Stamina: 80)");
        System.out.println();
        
        // Player 1 character selection
        System.out.print("Player 1, select your fighter (1-6): ");
        int p1Choice = scanner.nextInt();
        while (p1Choice < 1 || p1Choice > 6) {
            System.out.print("Invalid choice. Select a fighter (1-6): ");
            p1Choice = scanner.nextInt();
        }
        
        AnimeFighter player1 = createFighter(p1Choice);
        System.out.println();
        
        // Player 2 character selection
        System.out.print("Player 2, select your fighter (1-6): ");
        int p2Choice = scanner.nextInt();
        while (p2Choice < 1 || p2Choice > 6) {
            System.out.print("Invalid choice. Select a fighter (1-6): ");
            p2Choice = scanner.nextInt();
        }
        
        AnimeFighter player2 = createFighter(p2Choice);
        System.out.println();
        
        System.out.println("========================================");
        System.out.println("           BATTLE BEGINS!              ");
        System.out.println("========================================");
        System.out.println(player1.name + " vs " + player2.name);
        System.out.println();
        System.out.println("Starting Stats:");
        player1.showStats();
        player2.showStats();
        System.out.println();
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Battle loop
        boolean battleOngoing = true;
        int turn = 1;
        
        while (battleOngoing) {
            // Player 1 turn
            if (player1.health > 0 && player2.health > 0) {
                boolean validActionChosen = false;
                while (!validActionChosen) {
                    System.out.println("\n========================================");
                    System.out.println("    PLAYER 1'S TURN (" + player1.name + ")");
                    System.out.println("========================================");
                    player1.showStats();
                    System.out.println("\nOpponent: " + player2.name + " - HP: " + player2.health + "/" + player2.maxHealth + " | Stamina: " + player2.stamina + "/120");
                    System.out.println("\nChoose your action:");
                    System.out.println("1. Basic Attack (15 damage, +20 stamina)");
                    System.out.println("2. Skill 1 (30 stamina required)");
                    System.out.println("3. Skill 2 (40 stamina required)");
                    System.out.println("4. Skill 3 (50 stamina required)");
                    System.out.println("5. Ultimate (100 stamina required)");
                    if (!player1.bandageUsed) {
                        System.out.println("6. Use Bandage (+50 HP, once per round)");
                    }
                    if (!player1.potionUsed) {
                        System.out.println("7. Use Stamina Potion (+50 stamina, once per round)");
                    }
                    System.out.print("Enter choice: ");
                    
                    int action = 0;
                    try {
                        action = scanner.nextInt();
                    } catch (Exception e) {
                        System.out.println("Invalid input! Please try again.");
                        scanner.nextLine(); // Clear buffer
                        continue;
                    }
                    
                    // Validate action - only allow valid available actions
                    if (action < 1 || action > 5) {
                        if (action == 6 && !player1.bandageUsed) {
                            // 6 is valid if bandage not used
                        } else if (action == 7 && !player1.potionUsed) {
                            // 7 is valid if potion not used
                        } else {
                            System.out.println("Invalid action. Please choose an available option.");
                            continue;
                        }
                    }
                    
                    validActionChosen = true;
                    
                    if (action == 1) {
                        player1.basicAttack(player2);
                    } else if (action == 2) {
                        player1.skill1(player2);
                    } else if (action == 3) {
                        player1.skill2(player2);
                    } else if (action == 4) {
                        player1.skill3(player2);
                    } else if (action == 5) {
                        player1.ultimate(player2);
                    } else if (action == 6) {
                        player1.useBandage();
                    } else if (action == 7) {
                        player1.useStaminaPotion();
                    }
                }
                
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                
                if (player2.health <= 0) {
                    System.out.println("\n========================================");
                    System.out.println("      " + player1.name + " WINS!");
                    System.out.println("========================================");
                    battleOngoing = false;
                }
            }
            
            // Player 2 turn
            if (player1.health > 0 && player2.health > 0) {
                boolean validActionChosen = false;
                while (!validActionChosen) {
                    System.out.println("\n========================================");
                    System.out.println("    PLAYER 2'S TURN (" + player2.name + ")");
                    System.out.println("========================================");
                    player2.showStats();
                    System.out.println("\nOpponent: " + player1.name + " - HP: " + player1.health + "/" + player1.maxHealth + " | Stamina: " + player1.stamina + "/120");
                    System.out.println("\nChoose your action:");
                    System.out.println("1. Basic Attack (15 damage, +20 stamina)");
                    System.out.println("2. Skill 1 (30 stamina required)");
                    System.out.println("3. Skill 2 (40 stamina required)");
                    System.out.println("4. Skill 3 (50 stamina required)");
                    System.out.println("5. Ultimate (100 stamina required)");
                    if (!player2.bandageUsed) {
                        System.out.println("6. Use Bandage (+50 HP, once per round)");
                    }
                    if (!player2.potionUsed) {
                        System.out.println("7. Use Stamina Potion (+50 stamina, once per round)");
                    }
                    System.out.print("Enter choice: ");
                    
                    int action = 0;
                    try {
                        action = scanner.nextInt();
                    } catch (Exception e) {
                        System.out.println("Invalid input! Please try again.");
                        scanner.nextLine(); // Clear buffer
                        continue;
                    }
                    
                    // Validate action - only allow valid available actions
                    if (action < 1 || action > 5) {
                        if (action == 6 && !player2.bandageUsed) {
                            // 6 is valid if bandage not used
                        } else if (action == 7 && !player2.potionUsed) {
                            // 7 is valid if potion not used
                        } else {
                            System.out.println("Invalid action. Please choose an available option.");
                            continue;
                        }
                    }
                    
                    validActionChosen = true;
                    
                    if (action == 1) {
                        player2.basicAttack(player1);
                    } else if (action == 2) {
                        player2.skill1(player1);
                    } else if (action == 3) {
                        player2.skill2(player1);
                    } else if (action == 4) {
                        player2.skill3(player1);
                    } else if (action == 5) {
                        player2.ultimate(player1);
                    } else if (action == 6) {
                        player2.useBandage();
                    } else if (action == 7) {
                        player2.useStaminaPotion();
                    }
                }
                
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                
                if (player1.health <= 0) {
                    System.out.println("\n========================================");
                    System.out.println("      " + player2.name + " WINS!");
                    System.out.println("========================================");
                    battleOngoing = false;
                }
            }
            
            turn++;
        }
        
        scanner.close();
    }
    
    // Helper method to create fighters based on choice
    public static AnimeFighter createFighter(int choice) {
        if (choice == 1) {
            return new AnimeFighter("Naruto", 150, 80);
        } else if (choice == 2) {
            return new AnimeFighter("Goku", 160, 80);
        } else if (choice == 3) {
            return new AnimeFighter("Luffy", 145, 80);
        } else if (choice == 4) {
            return new AnimeFighter("Asta", 155, 80);
        } else if (choice == 5) {
            return new AnimeFighter("Saitama", 170, 80);
        } else if (choice == 6) {
            return new AnimeFighter("Gojo", 150, 80);
        } else {
            return new AnimeFighter("Naruto", 150, 80);
        }
    }

}
