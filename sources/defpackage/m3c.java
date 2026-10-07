package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class m3c {
    public static final Pattern a = Pattern.compile("[^\\p{L}\\p{Nd} ]+");

    public static CharSequence a(CharSequence charSequence, p4c p4cVar) {
        if (charSequence.length() != 0) {
            if (p4cVar.j(0, charSequence)) {
                ArrayList arrayListG = p4cVar.g(charSequence);
                if (!arrayListG.isEmpty()) {
                    return (CharSequence) ww3.r1(arrayListG);
                }
            }
            String strReplaceAll = a.matcher(charSequence).replaceAll("");
            if (strReplaceAll.length() != 0 && !r5h.X0(strReplaceAll)) {
                List listM1 = r5h.m1(strReplaceAll, new String[]{" "}, 6);
                ArrayList arrayList = new ArrayList();
                for (Object obj : listM1) {
                    if (!r5h.X0((String) obj)) {
                        arrayList.add(obj);
                    }
                }
                StringBuilder sb = new StringBuilder();
                int iMin = Math.min(arrayList.size(), 2);
                for (int i = 0; i < iMin; i++) {
                    String str = (String) arrayList.get(i);
                    if (str.length() != 0 && !r5h.X0(str)) {
                        sb.append(Character.toUpperCase(str.charAt(0)));
                    }
                }
                return sb.toString();
            }
            if (charSequence.length() > 0) {
                if (charSequence.length() != 0) {
                    return String.valueOf(charSequence.charAt(0));
                }
                ore.f("Char sequence is empty.");
                return null;
            }
        }
        return "";
    }

    public static String b(CharSequence charSequence, CharSequence charSequence2) {
        int i = charSequence2 == null ? 1 : 2;
        Pattern pattern = a;
        String strReplaceAll = pattern.matcher(charSequence).replaceAll("");
        if (charSequence2 == null) {
            charSequence2 = "";
        }
        String strReplaceAll2 = pattern.matcher(charSequence2).replaceAll("");
        StringBuilder sb = new StringBuilder();
        List listP0 = xw3.P0(r5h.P0(strReplaceAll), r5h.P0(strReplaceAll2));
        for (int i2 = 0; i2 < i; i2++) {
            Character ch = (Character) ww3.u1(i2, listP0);
            if (ch != null) {
                sb.append(ch.charValue());
            }
        }
        return sb.toString();
    }
}
