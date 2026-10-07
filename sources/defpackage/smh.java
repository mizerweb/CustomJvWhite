package defpackage;

import java.util.ArrayList;
import java.util.Objects;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes2.dex */
public final class smh extends e48 {
    public final String b;
    public final c98 c;

    public smh(String str, String str2, ghe gheVar) {
        super(str);
        lvb.R(!gheVar.isEmpty());
        this.b = str2;
        c98 c98VarN = c98.n(gheVar);
        this.c = c98VarN;
    }

    public static ArrayList d(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    @Override // defpackage.jwa
    public final void b(zz9 zz9Var) {
        byte b;
        switch (this.a) {
            case "TAL":
                b = 0;
                break;
            case "TCM":
                b = 1;
                break;
            case "TDA":
                b = 2;
                break;
            case "TP1":
                b = 3;
                break;
            case "TP2":
                b = 4;
                break;
            case "TP3":
                b = 5;
                break;
            case "TRK":
                b = 6;
                break;
            case "TT2":
                b = 7;
                break;
            case "TXT":
                b = 8;
                break;
            case "TYE":
                b = 9;
                break;
            case "TALB":
                b = 10;
                break;
            case "TCOM":
                b = 11;
                break;
            case "TCON":
                b = 12;
                break;
            case "TDAT":
                b = 13;
                break;
            case "TDRC":
                b = 14;
                break;
            case "TDRL":
                b = 15;
                break;
            case "TEXT":
                b = 16;
                break;
            case "TIT2":
                b = 17;
                break;
            case "TPE1":
                b = 18;
                break;
            case "TPE2":
                b = 19;
                break;
            case "TPE3":
                b = 20;
                break;
            case "TRCK":
                b = 21;
                break;
            case "TYER":
                b = 22;
                break;
            default:
                b = -1;
                break;
        }
        c98 c98Var = this.c;
        try {
            switch (b) {
                case 0:
                case 10:
                    zz9Var.c = (CharSequence) c98Var.get(0);
                    break;
                case 1:
                case 11:
                    zz9Var.z = (CharSequence) c98Var.get(0);
                    break;
                case 2:
                case 13:
                    String str = (String) c98Var.get(0);
                    int i = Integer.parseInt(str.substring(2, 4));
                    int i2 = Integer.parseInt(str.substring(0, 2));
                    zz9Var.t = Integer.valueOf(i);
                    zz9Var.u = Integer.valueOf(i2);
                    break;
                case 3:
                case 18:
                    zz9Var.b = (CharSequence) c98Var.get(0);
                    break;
                case 4:
                case 19:
                    zz9Var.d = (CharSequence) c98Var.get(0);
                    break;
                case 5:
                case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                    zz9Var.A = (CharSequence) c98Var.get(0);
                    break;
                case 6:
                case 21:
                    String str2 = (String) c98Var.get(0);
                    String str3 = vqi.a;
                    String[] strArrSplit = str2.split("/", -1);
                    int i3 = Integer.parseInt(strArrSplit[0]);
                    Integer numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    zz9Var.n = Integer.valueOf(i3);
                    zz9Var.o = numValueOf;
                    break;
                case 7:
                case 17:
                    zz9Var.a = (CharSequence) c98Var.get(0);
                    break;
                case 8:
                case 16:
                    zz9Var.y = (CharSequence) c98Var.get(0);
                    break;
                case 9:
                case 22:
                    zz9Var.s = Integer.valueOf(Integer.parseInt((String) c98Var.get(0)));
                    break;
                case 12:
                    Integer numJ = k4m.j((String) c98Var.get(0));
                    if (numJ != null) {
                        String strA = f48.a(numJ.intValue());
                        if (strA != null) {
                            zz9Var.D = strA;
                        }
                    } else {
                        zz9Var.D = (CharSequence) c98Var.get(0);
                    }
                    break;
                case 14:
                    ArrayList arrayListD = d((String) c98Var.get(0));
                    int size = arrayListD.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                zz9Var.u = (Integer) arrayListD.get(2);
                            }
                        }
                        zz9Var.t = (Integer) arrayListD.get(1);
                    }
                    zz9Var.s = (Integer) arrayListD.get(0);
                    break;
                case 15:
                    ArrayList arrayListD2 = d((String) c98Var.get(0));
                    int size2 = arrayListD2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                zz9Var.x = (Integer) arrayListD2.get(2);
                            }
                        }
                        zz9Var.w = (Integer) arrayListD2.get(1);
                    }
                    zz9Var.v = (Integer) arrayListD2.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || smh.class != obj.getClass()) {
            return false;
        }
        smh smhVar = (smh) obj;
        if (!this.a.equals(smhVar.a) || !Objects.equals(this.b, smhVar.b)) {
            return false;
        }
        c98 c98Var = smhVar.c;
        c98 c98Var2 = this.c;
        c98Var2.getClass();
        return j8f.a(c98Var2, c98Var);
    }

    public final int hashCode() {
        int iD = zo5.d(527, 31, this.a);
        String str = this.b;
        return this.c.hashCode() + ((iD + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.e48
    public final String toString() {
        return this.a + ": description=" + this.b + ": values=" + this.c;
    }
}
