package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cbj implements jwa {
    public final String a;
    public final String b;

    public cbj(String str, String str2) {
        this.a = n1g.c0(str);
        this.b = str2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.jwa
    public final void b(zz9 zz9Var) {
        String str = this.a;
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    b = 0;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    b = 1;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    b = 2;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    b = 3;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    b = 4;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    b = 5;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    b = 6;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    b = 7;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    b = 8;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    b = 9;
                }
                break;
        }
        String str2 = this.b;
        switch (b) {
            case 0:
                Integer numJ = k4m.j(str2);
                if (numJ != null) {
                    zz9Var.o = numJ;
                }
                break;
            case 1:
                Integer numJ2 = k4m.j(str2);
                if (numJ2 != null) {
                    zz9Var.C = numJ2;
                }
                break;
            case 2:
                Integer numJ3 = k4m.j(str2);
                if (numJ3 != null) {
                    zz9Var.n = numJ3;
                }
                break;
            case 3:
                zz9Var.c = str2;
                break;
            case 4:
                zz9Var.D = str2;
                break;
            case 5:
                zz9Var.a = str2;
                break;
            case 6:
                zz9Var.g = str2;
                break;
            case 7:
                Integer numJ4 = k4m.j(str2);
                if (numJ4 != null) {
                    zz9Var.B = numJ4;
                }
                break;
            case 8:
                zz9Var.d = str2;
                break;
            case 9:
                zz9Var.b = str2;
                break;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && cbj.class == obj.getClass()) {
            cbj cbjVar = (cbj) obj;
            if (this.a.equals(cbjVar.a) && this.b.equals(cbjVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + zo5.d(527, 31, this.a);
    }

    public final String toString() {
        return "VC: " + this.a + "=" + this.b;
    }
}
