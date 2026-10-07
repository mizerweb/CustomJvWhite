package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class vfk {
    public static final Pattern e = Pattern.compile("^a=(?:rtcp-fb|fmtp):(\\d+) (apt=(\\d+))?.*$");
    public static final Pattern f = Pattern.compile("^a=rtpmap:(\\d+) ([a-zA-Z0-9-]+)(/\\d+)+[\r]?$");
    public final HashSet a;
    public final String b;
    public final int c;
    public final LinkedHashMap d;

    public vfk(String str, int i, LinkedHashMap linkedHashMap) {
        this.b = str;
        this.c = i;
        this.d = linkedHashMap;
        this.a = new HashSet(linkedHashMap.size() * 7);
    }

    public static vfk a(int i, String str) {
        List listAsList = Arrays.asList(str.split(" "));
        if (listAsList.size() <= 3) {
            return null;
        }
        int i2 = 0;
        listAsList.subList(0, 3);
        ArrayList arrayList = new ArrayList(listAsList.subList(3, listAsList.size()));
        LinkedHashMap linkedHashMap = new LinkedHashMap(arrayList.size(), 2.0f);
        int size = arrayList.size();
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            String str2 = (String) obj;
            linkedHashMap.put(str2, new dfk(str2));
        }
        return new vfk(str, i, linkedHashMap);
    }

    public final ArrayList b(String str) {
        ArrayList arrayList = new ArrayList();
        for (dfk dfkVar : this.d.values()) {
            if (Objects.equals(str, dfkVar.b)) {
                arrayList.add(dfkVar);
            }
        }
        return arrayList;
    }

    public final void c(StringBuilder sb, List list, boolean z) {
        boolean zD = d(list);
        LinkedHashMap linkedHashMap = this.d;
        if (!zD && !z) {
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = ((dfk) it.next()).c;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    sb.append((String) obj);
                    sb.append("\r\n");
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ArrayList arrayListB = b((String) it2.next());
            int size2 = arrayListB.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayListB.get(i2);
                i2++;
                dfk dfkVar = (dfk) obj2;
                dfkVar.a(sb);
                ArrayList arrayList3 = dfkVar.d;
                int size3 = arrayList3.size();
                int i3 = 0;
                while (i3 < size3) {
                    Object obj3 = arrayList3.get(i3);
                    i3++;
                    String str = (String) obj3;
                    dfk dfkVar2 = (dfk) linkedHashMap.get(str);
                    if (dfkVar2 != null) {
                        dfkVar2.a(sb);
                        arrayList2.add(str);
                    }
                }
            }
        }
        if (z) {
            return;
        }
        for (dfk dfkVar3 : linkedHashMap.values()) {
            if (!list.contains(dfkVar3.b) && !arrayList2.contains(dfkVar3.a)) {
                dfkVar3.a(sb);
            }
        }
    }

    public final boolean d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!b((String) it.next()).isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void e(int i, String str) {
        dfk dfkVar;
        dfk dfkVar2;
        dfk dfkVar3;
        if (str.startsWith("a=")) {
            Matcher matcher = e.matcher(str);
            boolean zMatches = matcher.matches();
            HashSet hashSet = this.a;
            LinkedHashMap linkedHashMap = this.d;
            if (zMatches) {
                String strGroup = matcher.group(1);
                String strGroup2 = matcher.group(3);
                if (strGroup2 != null && (dfkVar3 = (dfk) linkedHashMap.get(strGroup2)) != null) {
                    dfkVar3.d.add(strGroup);
                }
                if (strGroup == null || (dfkVar2 = (dfk) linkedHashMap.get(strGroup)) == null) {
                    return;
                }
                dfkVar2.c.add(str);
                hashSet.add(Integer.valueOf(i));
                return;
            }
            Matcher matcher2 = f.matcher(str);
            if (matcher2.matches()) {
                String strGroup3 = matcher2.group(1);
                String strGroup4 = matcher2.group(2);
                if (strGroup4 == null || strGroup3 == null || (dfkVar = (dfk) linkedHashMap.get(strGroup3)) == null) {
                    return;
                }
                dfkVar.b = strGroup4;
                dfk dfkVar4 = (dfk) linkedHashMap.get(strGroup3);
                if (dfkVar4 == null) {
                    return;
                }
                dfkVar4.c.add(str);
                hashSet.add(Integer.valueOf(i));
            }
        }
    }

    public final void f(StringBuilder sb, List list, boolean z) {
        boolean zD = d(list);
        String str = this.b;
        if (!zD && !z) {
            sb.append(str);
            sb.append("\r\n");
            return;
        }
        List listSubList = Arrays.asList(str.split(" ")).subList(0, 3);
        ArrayList arrayList = new ArrayList();
        Iterator it = listSubList.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(' ');
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ArrayList arrayListB = b((String) it2.next());
            int size = arrayListB.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListB.get(i);
                i++;
                dfk dfkVar = (dfk) obj;
                sb.append(dfkVar.a);
                sb.append(' ');
                ArrayList arrayList2 = dfkVar.d;
                int size2 = arrayList2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    String str2 = (String) obj2;
                    sb.append(str2);
                    sb.append(' ');
                    arrayList.add(str2);
                }
            }
        }
        if (!z) {
            for (dfk dfkVar2 : this.d.values()) {
                String str3 = dfkVar2.b;
                String str4 = dfkVar2.a;
                if (!list.contains(str3) && !arrayList.contains(str4)) {
                    sb.append(str4);
                    sb.append(' ');
                }
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append("\r\n");
    }
}
