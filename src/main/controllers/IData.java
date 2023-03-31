// Package: main.controllers
package main.controllers;

// === === === Interface: IData implemented by Store === === ===
public interface IData {
    /**
     * Checks if the device is available (Implemented in Store)
     * @param id Get the id integer
     * @return boolean Return true or false, based on if the device exists
     */
    boolean isDeviceAvailable(int id);
}
