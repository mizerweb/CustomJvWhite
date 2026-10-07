package defpackage;

import org.apache.http.client.methods.HttpDelete;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class hda {
    public static final hda a;
    public static final hda b;
    public static final hda c;
    public static final hda d;
    public static final hda e;
    public static final hda f;
    public static final hda g;
    public static final hda h;
    public static final hda i;
    public static final hda j;
    public static final hda k;
    public static final hda l;
    public static final hda m;
    public static final hda n;
    public static final hda o;
    public static final hda p;
    public static final hda q;
    public static final hda r;
    public static final hda s;
    public static final hda t;
    public static final /* synthetic */ hda[] u;

    static {
        hda hdaVar = new hda("FORWARD", 0);
        a = hdaVar;
        hda hdaVar2 = new hda("COPY", 1);
        b = hdaVar2;
        hda hdaVar3 = new hda("REPORT", 2);
        c = hdaVar3;
        hda hdaVar4 = new hda("MARK_AS_UNREAD", 3);
        d = hdaVar4;
        hda hdaVar5 = new hda("REPLY", 4);
        e = hdaVar5;
        hda hdaVar6 = new hda(HttpDelete.METHOD_NAME, 5);
        f = hdaVar6;
        hda hdaVar7 = new hda("DELETE_FOR_ALL", 6);
        g = hdaVar7;
        hda hdaVar8 = new hda("PIN", 7);
        h = hdaVar8;
        hda hdaVar9 = new hda("UNPIN", 8);
        i = hdaVar9;
        hda hdaVar10 = new hda("SELECT", 9);
        j = hdaVar10;
        hda hdaVar11 = new hda("EDIT", 10);
        k = hdaVar11;
        hda hdaVar12 = new hda("SAVE_TO_GALLERY", 11);
        l = hdaVar12;
        hda hdaVar13 = new hda("COPY_PHOTO", 12);
        m = hdaVar13;
        hda hdaVar14 = new hda("SHARE_EXTERNAL", 13);
        n = hdaVar14;
        hda hdaVar15 = new hda("SHARE_POST", 14);
        o = hdaVar15;
        hda hdaVar16 = new hda("SHARE_MESSAGE", 15);
        p = hdaVar16;
        hda hdaVar17 = new hda("SCHEDULED_SEND_NOW", 16);
        q = hdaVar17;
        hda hdaVar18 = new hda("SCHEDULED_EDIT_TIME", 17);
        r = hdaVar18;
        hda hdaVar19 = new hda("POLL_REVOTE", 18);
        s = hdaVar19;
        hda hdaVar20 = new hda("POLL_FINISH", 19);
        t = hdaVar20;
        u = new hda[]{hdaVar, hdaVar2, hdaVar3, hdaVar4, hdaVar5, hdaVar6, hdaVar7, hdaVar8, hdaVar9, hdaVar10, hdaVar11, hdaVar12, hdaVar13, hdaVar14, hdaVar15, hdaVar16, hdaVar17, hdaVar18, hdaVar19, hdaVar20};
    }

    public static hda valueOf(String str) {
        return (hda) Enum.valueOf(hda.class, str);
    }

    public static hda[] values() {
        return (hda[]) u.clone();
    }
}
