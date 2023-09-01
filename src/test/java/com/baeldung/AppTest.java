package com.baeldung;

import Menus.Menu;
import MySQL.BDD_connexion;
import characters.Characters;
import characters.Warriors;
import characters.Wizards;
import exceptions.DatabaseException;
import exceptions.PropertiesException;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void propertiesTest() {
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(".env"));
        } catch (Exception e) {
            assertTrue("Le fichier .env doit pouvoir être lu !", false);
        }
        String url = prop.getProperty("url");
        String username = prop.getProperty("login");
        String password = prop.getProperty("pass");
        assertTrue("L/'url doit être jdbc:mysql://localhost:3306/Heroes mais elle est : " + url, url.equalsIgnoreCase("jdbc:mysql://localhost:3306/Heroes"));
        assertTrue("Le username doit être player mais il est : "+ username, username.equalsIgnoreCase("player"));
        assertTrue("\"Le password devrait être plyer_password mais il est : " + password, password.equalsIgnoreCase("player_password"));
    }

    @Test
    public void connection_test() throws PropertiesException, DatabaseException {
        //private static void connect_to_BDD (){
        Connection connection = BDD_connexion.getConnection();
        assertNotNull(connection);
    }

    @Test
    public void select_heroes() throws PropertiesException, DatabaseException {
        List<Characters> characters = BDD_connexion.select_heroes();
        assertEquals(characters.size(), 2);
    }

    public void shouldNotCloseMoreThanOnce() throws PropertiesException, DatabaseException {
        Connection connection = BDD_connexion.getConnection();
        BDD_connexion.close_connection();
        try {
            BDD_connexion.close_connection();
            assertTrue(false);
        } catch (Exception e) {
            assertTrue(e instanceof DatabaseException);
        }
    }
}
