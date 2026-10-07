package defpackage;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class tt2 {
    public static int a(String str) {
        str.getClass();
        switch (str) {
            case "THREAT":
                return 5;
            case "EXTREMISM":
                return 3;
            case "FAKE":
                return 4;
            case "SPAM":
                return 1;
            case "OTHER":
                return 6;
            case "PORNO":
                return 2;
            default:
                ore.p(c0a.o("No such value ", str, " for Complaint"));
                return 0;
        }
    }

    public static /* synthetic */ String b(int i) {
        switch (i) {
            case 1:
                return "SPAM";
            case 2:
                return "PORNO";
            case 3:
                return "EXTREMISM";
            case 4:
                return "FAKE";
            case 5:
                return "THREAT";
            case 6:
                return "OTHER";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String c(int i) {
        switch (i) {
            case 1:
                return "BLOCK";
            case 2:
                return "UNBLOCK";
            case 3:
                return "REMOVE";
            case 4:
                return "ADD";
            case 5:
                return "UPDATE";
            case 6:
                return "HIDE_STORIES";
            case 7:
                return "SHOW_STORIES";
            default:
                throw null;
        }
    }

    public static vwd d(r05 r05Var, t05 t05Var, int i) {
        return dp5.a(new s05(r05Var, t05Var, i, 0));
    }

    public static void e(int i, HashMap map, String str, int i2, String str2) {
        map.put(str, Integer.valueOf(i));
        map.put(str2, Integer.valueOf(i2));
    }

    public static void f(String str, String str2, String str3) {
        lvb.G0(str3, str + str2);
    }

    public static /* synthetic */ boolean g(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, p94 p94Var, Object obj, p94 p94Var2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(p94Var, obj, p94Var2)) {
            if (atomicReferenceFieldUpdater.get(p94Var) != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ String h(int i) {
        if (i == 1) {
            return "PRIMARY";
        }
        if (i == 2) {
            return "SECONDARY";
        }
        if (i == 3) {
            return "SQUIRCLE";
        }
        if (i == 4) {
            return "SQUIRCLE_THEMED";
        }
        throw null;
    }

    public static /* synthetic */ String i(int i) {
        if (i == 1) {
            return "SMALL";
        }
        if (i == 2) {
            return "SEMI_SMALL";
        }
        if (i == 3) {
            return "LARGE";
        }
        throw null;
    }

    public static /* synthetic */ String j(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "PRIVATE";
        }
        return "PUBLIC";
    }

    public static /* synthetic */ String k(int i) {
        if (i == 1) {
            return "PRIMARY";
        }
        if (i == 2) {
            return "SECONDARY";
        }
        if (i != 3) {
            return i != 4 ? "null" : "SQUIRCLE_THEMED";
        }
        return "SQUIRCLE";
    }

    public static /* synthetic */ String l(int i) {
        if (i == 1) {
            return "SMALL";
        }
        if (i != 2) {
            return i != 3 ? "null" : "LARGE";
        }
        return "SEMI_SMALL";
    }

    public static /* synthetic */ String m(int i) {
        if (i == 1) {
            return "UNKNOWN";
        }
        if (i != 2) {
            return i != 3 ? "null" : "FEMALE";
        }
        return "MALE";
    }

    public static /* synthetic */ String n(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "BEHIND";
        }
        return "AHEAD";
    }

    public static /* synthetic */ String o(int i) {
        if (i == 1) {
            return "NONE";
        }
        if (i != 2) {
            return i != 3 ? "null" : "POLYMORPHIC";
        }
        return "ALL_JSON_OBJECTS";
    }

    public static /* synthetic */ String p(int i) {
        switch (i) {
            case 1:
                return "APP_CLOSED";
            case 2:
                return "APP_DISCONNECTED";
            case 3:
                return "CAMERA2_CLOSED";
            case 4:
                return "CAMERA2_DISCONNECTED";
            case 5:
                return "CAMERA2_ERROR";
            case 6:
                return "CAMERA2_EXCEPTION";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String q(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "RECORD_CALL";
        }
        return "NONE";
    }

    public static /* synthetic */ int r(String str) {
        if (str == null) {
            ore.n("Name is null");
            return 0;
        }
        if (str.equals("NEGATIVE")) {
            return 1;
        }
        if (str.equals("NEUTRAL")) {
            return 2;
        }
        if (str.equals("NEUTRAL_THEMED")) {
            return 3;
        }
        if (str.equals("THEMED_ACCENT")) {
            return 4;
        }
        ore.p("No enum constant one.me.sdk.bottomsheet.ConfirmationBottomSheet.Button.Appearance.".concat(str));
        return 0;
    }

    public static /* synthetic */ int s(String str) {
        if (str == null) {
            ore.n("Name is null");
            return 0;
        }
        if (str.equals("SMALL")) {
            return 1;
        }
        if (str.equals("MEDIUM")) {
            return 2;
        }
        if (str.equals("LARGE")) {
            return 3;
        }
        ore.p("No enum constant one.me.sdk.bottomsheet.ConfirmationBottomSheet.Button.Size.".concat(str));
        return 0;
    }

    public static /* synthetic */ int t(String str) {
        if (str == null) {
            ore.n("Name is null");
            return 0;
        }
        if (str.equals("NEGATIVE")) {
            return 1;
        }
        if (str.equals("NEUTRAL")) {
            return 2;
        }
        if (str.equals("PRIMARY")) {
            return 3;
        }
        if (str.equals("THEMED")) {
            return 4;
        }
        ore.p("No enum constant one.me.sdk.bottomsheet.ConfirmationBottomSheet.Button.Type.".concat(str));
        return 0;
    }

    public static /* synthetic */ int u(String str) {
        if (str == null) {
            ore.n("Name is null");
            return 0;
        }
        if (str.equals("PRIMARY")) {
            return 1;
        }
        if (str.equals("SECONDARY")) {
            return 2;
        }
        if (str.equals("SQUIRCLE")) {
            return 3;
        }
        if (str.equals("SQUIRCLE_THEMED")) {
            return 4;
        }
        ore.p("No enum constant one.me.sdk.bottomsheet.ConfirmationBottomSheet.Icon.Appearance.".concat(str));
        return 0;
    }

    public static /* synthetic */ int v(String str) {
        if (str == null) {
            ore.n("Name is null");
            return 0;
        }
        if (str.equals("SMALL")) {
            return 1;
        }
        if (str.equals("SEMI_SMALL")) {
            return 2;
        }
        if (str.equals("LARGE")) {
            return 3;
        }
        ore.p("No enum constant one.me.sdk.bottomsheet.ConfirmationBottomSheet.Icon.Size.".concat(str));
        return 0;
    }
}
