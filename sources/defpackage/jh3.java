package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jh3 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    public /* synthetic */ jh3(int i, String str, String str2, String str3, String str4) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        int i = this.a;
        String str = this.e;
        String str2 = this.d;
        String str3 = this.c;
        String str4 = this.b;
        switch (i) {
            case 0:
                vxe vxeVarO0 = ((qxe) obj).O0("SELECT docid FROM chat_title WHERE originalTitle MATCH ? OR normalizedTitle MATCH ? OR normalizedTitleWithoutEmoji MATCH ? OR originalTitleWithoutEmoji MATCH ? || '*' ORDER BY sortTime DESC ");
                try {
                    vxeVarO0.B(1, str4);
                    vxeVarO0.B(2, str3);
                    if (str2 == null) {
                        vxeVarO0.e(3);
                    } else {
                        vxeVarO0.B(3, str2);
                    }
                    if (str == null) {
                        vxeVarO0.e(4);
                    } else {
                        vxeVarO0.B(4, str);
                    }
                    ArrayList arrayList = new ArrayList();
                    while (vxeVarO0.M0()) {
                        arrayList.add(Long.valueOf(vxeVarO0.getLong(0)));
                        break;
                    }
                    return arrayList;
                } finally {
                    vxeVarO0.close();
                }
            case 1:
                vxe vxeVarO1 = ((qxe) obj).O0("SELECT docid FROM chat_title WHERE originalTitle LIKE ? OR normalizedTitle LIKE ? OR normalizedTitleWithoutEmoji LIKE ? OR originalTitleWithoutEmoji LIKE ? ORDER BY sortTime DESC ");
                try {
                    vxeVarO1.B(1, str4);
                    vxeVarO1.B(2, str3);
                    if (str2 == null) {
                        vxeVarO1.e(3);
                    } else {
                        vxeVarO1.B(3, str2);
                    }
                    if (str == null) {
                        vxeVarO1.e(4);
                    } else {
                        vxeVarO1.B(4, str);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    while (vxeVarO1.M0()) {
                        arrayList2.add(Long.valueOf(vxeVarO1.getLong(0)));
                        break;
                    }
                    return arrayList2;
                } finally {
                    vxeVarO1.close();
                }
            case 2:
                vxe vxeVarO2 = ((qxe) obj).O0("SELECT docid FROM contact_title WHERE (allOriginalTitles LIKE ? OR allNormalizedTitles LIKE ? OR link LIKE ? OR allNormalizedTitlesWithoutEmoji LIKE ? OR allOriginalTitlesWithoutEmoji LIKE ?)");
                try {
                    vxeVarO2.B(1, str4);
                    vxeVarO2.B(2, str3);
                    vxeVarO2.B(3, str3);
                    if (str2 == null) {
                        vxeVarO2.e(4);
                    } else {
                        vxeVarO2.B(4, str2);
                    }
                    if (str == null) {
                        vxeVarO2.e(5);
                    } else {
                        vxeVarO2.B(5, str);
                    }
                    ArrayList arrayList3 = new ArrayList();
                    while (vxeVarO2.M0()) {
                        arrayList3.add(Long.valueOf(vxeVarO2.getLong(0)));
                        break;
                    }
                    return arrayList3;
                } finally {
                    vxeVarO2.close();
                }
            default:
                vxe vxeVarO3 = ((qxe) obj).O0("SELECT docid FROM contact_title WHERE (allOriginalTitles MATCH ? OR allNormalizedTitles MATCH ? OR link MATCH ? OR allNormalizedTitlesWithoutEmoji MATCH ? OR allOriginalTitlesWithoutEmoji MATCH ? || '*')");
                try {
                    vxeVarO3.B(1, str4);
                    vxeVarO3.B(2, str3);
                    vxeVarO3.B(3, str3);
                    if (str2 == null) {
                        vxeVarO3.e(4);
                    } else {
                        vxeVarO3.B(4, str2);
                    }
                    if (str == null) {
                        vxeVarO3.e(5);
                    } else {
                        vxeVarO3.B(5, str);
                    }
                    ArrayList arrayList4 = new ArrayList();
                    while (vxeVarO3.M0()) {
                        arrayList4.add(Long.valueOf(vxeVarO3.getLong(0)));
                        break;
                    }
                    return arrayList4;
                } finally {
                    vxeVarO3.close();
                }
        }
    }
}
