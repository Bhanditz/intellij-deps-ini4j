/*
 * Copyright 2005,2009 Ivan SZKIBA
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ini4j.addon;

import org.ini4j.Config;
import org.ini4j.Ini;
import org.ini4j.InvalidIniFormatException;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

import java.net.URL;

public class Wini extends Ini
{
    public Wini()
    {
        Config cfg = new Config();

        cfg.setEscape(false);
        cfg.setGlobalSection(true);
        cfg.setEmptyOption(true);
        cfg.setMultiOption(false);
        setConfig(cfg);
    }

    public Wini(File input) throws IOException, InvalidIniFormatException
    {
        this();
        load(input);
    }

    public Wini(URL input) throws IOException, InvalidIniFormatException
    {
        this();
        load(input);
    }

    public Wini(InputStream input) throws IOException, InvalidIniFormatException
    {
        this();
        load(input);
    }

    public Wini(Reader input) throws IOException, InvalidIniFormatException
    {
        this();
        load(input);
    }
}