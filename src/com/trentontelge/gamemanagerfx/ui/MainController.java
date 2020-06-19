package com.trentontelge.gamemanagerfx.ui;

import com.trentontelge.gamemanagerfx.Main;
import com.trentontelge.gamemanagerfx.prototypes.Game;
import com.trentontelge.gamemanagerfx.util.DBFileFilter;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;

import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    public MenuItem closeMenu;
    public MenuItem addGameMenu;
    public MenuItem importDBMenu;
    public MenuItem exportCSVMenu;
    public TableView<Game> gameTable;
    public TableColumn<Game, Image> iconCol;
    public TableColumn<Game, String> titleCol;
    public TableColumn<Game, String> circleCol;
    public TableColumn<Game, Image> ratingCol;
    public TableColumn<Game, String> sizeCol;
    public TableColumn<Game, String> tagsCol;
    private ObservableList<Game> data;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        

        importDBMenu.setOnAction(e -> {
            JFileChooser dbChooser = new JFileChooser();
            dbChooser.addChoosableFileFilter(new DBFileFilter());
            dbChooser.setAcceptAllFileFilterUsed(false);
            int returnval = dbChooser.showDialog(new JFrame("Import DB File"), "Import DB File");
            if (returnval == JFileChooser.APPROVE_OPTION) {
                Main.param = dbChooser.getSelectedFile();
                Main.showImportBar();
            }
        });
        addGameMenu.setOnAction(e -> {
            //TODO open add game modal
        });
        exportCSVMenu.setOnAction( e -> {
            //TODO export games table to csv
        });
    }
}
