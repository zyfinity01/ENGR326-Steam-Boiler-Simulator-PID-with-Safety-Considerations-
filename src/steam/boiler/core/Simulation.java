package steam.boiler.core;

import org.eclipse.jdt.annotation.NonNull;

import steam.boiler.simulator.SimulationCharacteristicsDialog;
import steam.boiler.util.SteamBoilerCharacteristics;

/**
 * Provides a simple way to fire up the simulation interface using a given
 * controller.
 *
 * @author David J. Pearce
 *
 */
public class Simulation {
  /**
   * Constructs a new simulation window.
   *
   * @param args Command-line arguments (these are ignored).
   */
  public static void main(String[] args) {
    // Begin the simulation by opening the characteristics selection dialog.
    new SimulationCharacteristicsDialog((@NonNull SteamBoilerCharacteristics cs) -> {
      return new MySteamBoilerController(cs);
    }).setVisible(true);
  }
}
