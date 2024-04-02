package us.codecraft.webmagic.scripts;

import javax.script.ScriptEngine;
import javax.script.ScriptException;
import java.util.Iterator;
import java.util.Map;

import org.jruby.RubyHash;
import org.python.core.PyDictionary;

import us.codecraft.webmagic.Page;

/**
 * @author Le gib
 */
public abstract class Language {
    public Language(String engineName, String defineFile, String gatherFile) {
        this.engineName = engineName;
        this.defineFile = defineFile;
        this.gatherFile = gatherFile;
    }

    private String engineName;

    private String defineFile;

    private String gatherFile;

    public String getEngineName() {
        return engineName;
    }

    public String getDefineFile() {
        return defineFile;
    }

    public String getGatherFile() {
        return gatherFile;
    }

    public abstract void process(ScriptEngine engine, String defines, String script, Page page) throws ScriptException;
}
