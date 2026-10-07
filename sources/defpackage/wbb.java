package defpackage;

import org.webrtc.SessionDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class wbb {
    public static final wbb a;
    public static final wbb b;
    public static final wbb c;
    public static final wbb d;
    public static final wbb e;
    public static final wbb f;
    public static final wbb g;
    public static final wbb h;
    public static final wbb i;
    public static final wbb j;
    public static final /* synthetic */ wbb[] k;

    static {
        wbb wbbVar = new wbb("CREATE_OFFER", 0);
        a = wbbVar;
        wbb wbbVar2 = new wbb("CREATE_ANSWER", 1);
        b = wbbVar2;
        wbb wbbVar3 = new wbb("SET_LOCAL_OFFER", 2);
        c = wbbVar3;
        wbb wbbVar4 = new wbb("SET_REMOTE_OFFER", 3);
        d = wbbVar4;
        wbb wbbVar5 = new wbb("SET_LOCAL_ANSWER", 4);
        e = wbbVar5;
        wbb wbbVar6 = new wbb("SET_REMOTE_ANSWER", 5);
        f = wbbVar6;
        wbb wbbVar7 = new wbb("SET_LOCAL_PRANSWER", 6);
        g = wbbVar7;
        wbb wbbVar8 = new wbb("SET_REMOTE_PRANSWER", 7);
        h = wbbVar8;
        wbb wbbVar9 = new wbb("SET_LOCAL_ROLLBACK", 8);
        i = wbbVar9;
        wbb wbbVar10 = new wbb("SET_REMOTE_ROLLBACK", 9);
        j = wbbVar10;
        k = new wbb[]{wbbVar, wbbVar2, wbbVar3, wbbVar4, wbbVar5, wbbVar6, wbbVar7, wbbVar8, wbbVar9, wbbVar10};
    }

    public static final wbb a(SessionDescription.Type type, boolean z) {
        type.getClass();
        int i2 = vbb.$EnumSwitchMapping$0[type.ordinal()];
        if (i2 == 1) {
            return z ? c : d;
        }
        if (i2 == 2) {
            return z ? g : h;
        }
        if (i2 == 3) {
            return z ? e : f;
        }
        if (i2 == 4) {
            return z ? i : j;
        }
        ore.o();
        return null;
    }

    public static wbb valueOf(String str) {
        return (wbb) Enum.valueOf(wbb.class, str);
    }

    public static wbb[] values() {
        return (wbb[]) k.clone();
    }
}
