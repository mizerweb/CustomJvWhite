package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final class u9c extends o3 {
    public static final /* synthetic */ zv8[] l = {new z8b(u9c.class, "fileOpenStats", "getFileOpenStats()Ljava/lang/String;"), zo5.e(zfe.a, u9c.class, "opcodeStats", "getOpcodeStats()Ljava/lang/String;"), new z8b(u9c.class, "phonebookSize", "getPhonebookSize()I"), new z8b(u9c.class, "anrDetected", "getAnrDetected()Z"), new z8b(u9c.class, "caughtExceptionCount", "getCaughtExceptionCount()I"), new z8b(u9c.class, "crashDetected", "getCrashDetected()I"), new z8b(u9c.class, "frescoStats", "getFrescoStats()Lru/ok/tamtam/prefs/StatPrefs$FrescoStats;"), new z8b(u9c.class, "appClockDump", "getAppClockDump()Lru/ok/tamtam/models/AppClockDump;")};
    public final gvb e;
    public final gvb f;
    public final gvb g;
    public final gvb h;
    public final gvb i;
    public final pgg j;
    public final qg7 k;

    public u9c(Context context, cs6 cs6Var) {
        super(context, "stat_prefs", cs6Var);
        this.e = new gvb(zfe.a(String.class), (SharedPreferences) this.d, (Object) "", "file.open_stats");
        this.f = new gvb(zfe.a(String.class), (SharedPreferences) this.d, (Object) "", "session.opcode_stats");
        this.g = new gvb(zfe.a(Integer.class), (SharedPreferences) this.d, (Object) 0, "app.phonebook.size");
        Boolean bool = Boolean.FALSE;
        this.h = new gvb(zfe.a(Boolean.class), (SharedPreferences) this.d, (Object) bool, "app.anr.detected");
        zfe.a(Integer.class);
        this.i = new gvb(zfe.a(Integer.class), (SharedPreferences) this.d, (Object) 0, "app.crash.detected");
        bjg.Companion.getClass();
        this.j = new pgg(this);
        this.k = new qg7(this, 18, new uq(63, 0L, 0L));
    }
}
