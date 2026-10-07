package defpackage;

import org.apache.http.client.methods.HttpDelete;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ut2 {
    public static final ut2 a;
    public static final ut2 b;
    public static final ut2 c;
    public static final ut2 d;
    public static final ut2 e;
    public static final ut2 f;
    public static final ut2 g;
    public static final ut2 h;
    public static final ut2 i;
    public static final ut2 j;
    public static final ut2 k;
    public static final ut2 l;
    public static final ut2 m;
    public static final ut2 n;
    public static final ut2 o;
    public static final ut2 p;
    public static final ut2 q;
    public static final ut2 r;
    public static final ut2 s;
    public static final ut2 t;
    public static final ut2 u;
    public static final ut2 v;
    public static final ut2 w;
    public static final ut2 x;
    public static final /* synthetic */ ut2[] y;

    static {
        ut2 ut2Var = new ut2("ADD_TO_FOLDER", 0);
        a = ut2Var;
        ut2 ut2Var2 = new ut2("REMOVE_FROM_FOLDER", 1);
        b = ut2Var2;
        ut2 ut2Var3 = new ut2("ADD_FAVORITE", 2);
        c = ut2Var3;
        ut2 ut2Var4 = new ut2("REMOVE_FAVORITE", 3);
        d = ut2Var4;
        ut2 ut2Var5 = new ut2("MARK_AS_UNREAD", 4);
        e = ut2Var5;
        ut2 ut2Var6 = new ut2("MARK_AS_READ", 5);
        f = ut2Var6;
        ut2 ut2Var7 = new ut2("MUTE", 6);
        g = ut2Var7;
        ut2 ut2Var8 = new ut2("UNMUTE", 7);
        h = ut2Var8;
        ut2 ut2Var9 = new ut2("LEAVE_CHAT", 8);
        i = ut2Var9;
        ut2 ut2Var10 = new ut2("LEAVE_CHANNEL", 9);
        j = ut2Var10;
        ut2 ut2Var11 = new ut2("UNSUBSCRIBE_CHANNEL", 10);
        k = ut2Var11;
        ut2 ut2Var12 = new ut2("DELETE_CHANNEL", 11);
        l = ut2Var12;
        ut2 ut2Var13 = new ut2("DELETE_CHAT_FOR_ALL", 12);
        m = ut2Var13;
        ut2 ut2Var14 = new ut2("DELETE_CHAT", 13);
        n = ut2Var14;
        ut2 ut2Var15 = new ut2("DELETE_FOR_ALL", 14);
        ut2 ut2Var16 = new ut2(HttpDelete.METHOD_NAME, 15);
        o = ut2Var16;
        ut2 ut2Var17 = new ut2("BLOCK", 16);
        p = ut2Var17;
        ut2 ut2Var18 = new ut2("UNBLOCK", 17);
        q = ut2Var18;
        ut2 ut2Var19 = new ut2("SELECT", 18);
        r = ut2Var19;
        ut2 ut2Var20 = new ut2("REPORT", 19);
        s = ut2Var20;
        ut2 ut2Var21 = new ut2("CLEAR_HISTORY", 20);
        t = ut2Var21;
        ut2 ut2Var22 = new ut2("SUSPEND_BOT", 21);
        u = ut2Var22;
        ut2 ut2Var23 = new ut2("SUSPEND_AND_DELETE_BOT", 22);
        v = ut2Var23;
        ut2 ut2Var24 = new ut2("CLEAR_SAVED_MESSAGES", 23);
        w = ut2Var24;
        ut2 ut2Var25 = new ut2("DUMP_META", 24);
        x = ut2Var25;
        y = new ut2[]{ut2Var, ut2Var2, ut2Var3, ut2Var4, ut2Var5, ut2Var6, ut2Var7, ut2Var8, ut2Var9, ut2Var10, ut2Var11, ut2Var12, ut2Var13, ut2Var14, ut2Var15, ut2Var16, ut2Var17, ut2Var18, ut2Var19, ut2Var20, ut2Var21, ut2Var22, ut2Var23, ut2Var24, ut2Var25};
    }

    public static ut2 valueOf(String str) {
        return (ut2) Enum.valueOf(ut2.class, str);
    }

    public static ut2[] values() {
        return (ut2[]) y.clone();
    }
}
