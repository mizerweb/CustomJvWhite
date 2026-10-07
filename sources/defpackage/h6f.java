package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.Task;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class h6f implements s8g, kg7, hch, kq4 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public h6f() {
        this.a = 13;
        this.b = new String[100];
        this.c = new String[100];
        Pattern patternCompile = Pattern.compile("\\|\\s+\\|\\s+\\|\\s+\\|");
        Pattern patternCompile2 = Pattern.compile("\\|\\s*(\\d+)\\s*\\|\\s*([^\\|]+)\\s*\\|\\s+\\|");
        Pattern patternCompile3 = Pattern.compile("\\|\\s*(\\d+)\\s*\\|\\s*([^\\|]+)\\s*\\|\\s*([^\\|]+)\\s*\\|");
        Pattern patternCompile4 = Pattern.compile("\\|\\s+\\|\\s*([^\\|]*)\\s*\\|\\s*([^\\|]*)\\s*\\|");
        try {
            BufferedReader bufferedReader = new BufferedReader(new StringReader("   | 0    | :authority                  |                              |\n   |      |                             |                              |\n   | 1    | :path                       | /                            |\n   |      |                             |                              |\n   | 2    | age                         | 0                            |\n   |      |                             |                              |\n   | 3    | content-disposition         |                              |\n   |      |                             |                              |\n   | 4    | content-length              | 0                            |\n   |      |                             |                              |\n   | 5    | cookie                      |                              |\n   |      |                             |                              |\n   | 6    | date                        |                              |\n   |      |                             |                              |\n   | 7    | etag                        |                              |\n   |      |                             |                              |\n   | 8    | if-modified-since           |                              |\n   |      |                             |                              |\n   | 9    | if-none-match               |                              |\n   |      |                             |                              |\n   | 10   | last-modified               |                              |\n   |      |                             |                              |\n   | 11   | link                        |                              |\n   |      |                             |                              |\n   | 12   | location                    |                              |\n   |      |                             |                              |\n   | 13   | referer                     |                              |\n   |      |                             |                              |\n   | 14   | set-cookie                  |                              |\n   |      |                             |                              |\n   | 15   | :method                     | CONNECT                      |\n   |      |                             |                              |\n   | 16   | :method                     | DELETE                       |\n   |      |                             |                              |\n   | 17   | :method                     | GET                          |\n   |      |                             |                              |\n   | 18   | :method                     | HEAD                         |\n   |      |                             |                              |\n   | 19   | :method                     | OPTIONS                      |\n   |      |                             |                              |\n   | 20   | :method                     | POST                         |\n   |      |                             |                              |\n   | 21   | :method                     | PUT                          |\n   |      |                             |                              |\n   | 22   | :scheme                     | http                         |\n   |      |                             |                              |\n   | 23   | :scheme                     | https                        |\n   |      |                             |                              |\n   | 24   | :status                     | 103                          |\n   |      |                             |                              |\n   | 25   | :status                     | 200                          |\n   |      |                             |                              |\n   | 26   | :status                     | 304                          |\n   |      |                             |                              |\n   | 27   | :status                     | 404                          |\n   |      |                             |                              |\n   | 28   | :status                     | 503                          |\n   |      |                             |                              |\n   | 29   | accept                      | */*                          |\n   |      |                             |                              |\n   | 30   | accept                      | application/dns-message      |\n   |      |                             |                              |\n   | 31   | accept-encoding             | gzip, deflate, br            |\n   |      |                             |                              |\n   | 32   | accept-ranges               | bytes                        |\n   |      |                             |                              |\n   | 33   | access-control-allow-       | cache-control                |\n   |      | headers                     |                              |\n   |      |                             |                              |\n   | 34   | access-control-allow-       | content-type                 |\n   |      | headers                     |                              |\n   |      |                             |                              |\n   | 35   | access-control-allow-origin | *                            |\n   |      |                             |                              |\n   | 36   | cache-control               | max-age=0                    |\n   |      |                             |                              |\n   | 37   | cache-control               | max-age=2592000              |\n   |      |                             |                              |\n   | 38   | cache-control               | max-age=604800               |\n   |      |                             |                              |\n   | 39   | cache-control               | no-cache                     |\n   |      |                             |                              |\n   | 40   | cache-control               | no-store                     |\n   |      |                             |                              |\n   | 41   | cache-control               | public, max-age=31536000     |\n   |      |                             |                              |\n   | 42   | content-encoding            | br                           |\n   |      |                             |                              |\n   | 43   | content-encoding            | gzip                         |\n   |      |                             |                              |\n   | 44   | content-type                | application/dns-message      |\n   |      |                             |                              |\n   | 45   | content-type                | application/javascript       |\n   |      |                             |                              |\n   | 46   | content-type                | application/json             |\n   |      |                             |                              |\n   | 47   | content-type                | application/x-www-form-      |\n   |      |                             | urlencoded                   |\n   |      |                             |                              |\n   | 48   | content-type                | image/gif                    |\n   |      |                             |                              |\n   | 49   | content-type                | image/jpeg                   |\n   |      |                             |                              |\n   | 50   | content-type                | image/png                    |\n   |      |                             |                              |\n   | 51   | content-type                | text/css                     |\n   |      |                             |                              |\n   | 52   | content-type                | text/html; charset=utf-8     |\n   |      |                             |                              |\n   | 53   | content-type                | text/plain                   |\n   |      |                             |                              |\n   | 54   | content-type                | text/plain;charset=utf-8     |\n   |      |                             |                              |\n   | 55   | range                       | bytes=0-                     |\n   |      |                             |                              |\n   | 56   | strict-transport-security   | max-age=31536000             |\n   |      |                             |                              |\n   | 57   | strict-transport-security   | max-age=31536000;            |\n   |      |                             | includesubdomains            |\n   |      |                             |                              |\n   | 58   | strict-transport-security   | max-age=31536000;            |\n   |      |                             | includesubdomains; preload   |\n   |      |                             |                              |\n   | 59   | vary                        | accept-encoding              |\n   |      |                             |                              |\n   | 60   | vary                        | origin                       |\n   |      |                             |                              |\n   | 61   | x-content-type-options      | nosniff                      |\n   |      |                             |                              |\n   | 62   | x-xss-protection            | 1; mode=block                |\n   |      |                             |                              |\n   | 63   | :status                     | 100                          |\n   |      |                             |                              |\n   | 64   | :status                     | 204                          |\n   |      |                             |                              |\n   | 65   | :status                     | 206                          |\n   |      |                             |                              |\n   | 66   | :status                     | 302                          |\n   |      |                             |                              |\n   | 67   | :status                     | 400                          |\n   |      |                             |                              |\n   | 68   | :status                     | 403                          |\n   |      |                             |                              |\n   | 69   | :status                     | 421                          |\n   |      |                             |                              |\n   | 70   | :status                     | 425                          |\n   |      |                             |                              |\n   | 71   | :status                     | 500                          |\n   |      |                             |                              |\n   | 72   | accept-language             |                              |\n   |      |                             |                              |\n   | 73   | access-control-allow-       | FALSE                        |\n   |      | credentials                 |                              |\n   |      |                             |                              |\n   | 74   | access-control-allow-       | TRUE                         |\n   |      | credentials                 |                              |\n   |      |                             |                              |\n   | 75   | access-control-allow-       | *                            |\n   |      | headers                     |                              |\n   |      |                             |                              |\n   | 76   | access-control-allow-       | get                          |\n   |      | methods                     |                              |\n   |      |                             |                              |\n   | 77   | access-control-allow-       | get, post, options           |\n   |      | methods                     |                              |\n   |      |                             |                              |\n   | 78   | access-control-allow-       | options                      |\n   |      | methods                     |                              |\n   |      |                             |                              |\n   | 79   | access-control-expose-      | content-length               |\n   |      | headers                     |                              |\n   |      |                             |                              |\n   | 80   | access-control-request-     | content-type                 |\n   |      | headers                     |                              |\n   |      |                             |                              |\n   | 81   | access-control-request-     | get                          |\n   |      | method                      |                              |\n   |      |                             |                              |\n   | 82   | access-control-request-     | post                         |\n   |      | method                      |                              |\n   |      |                             |                              |\n   | 83   | alt-svc                     | clear                        |\n   |      |                             |                              |\n   | 84   | authorization               |                              |\n   |      |                             |                              |\n   | 85   | content-security-policy     | script-src 'none'; object-   |\n   |      |                             | src 'none'; base-uri 'none'  |\n   |      |                             |                              |\n   | 86   | early-data                  | 1                            |\n   |      |                             |                              |\n   | 87   | expect-ct                   |                              |\n   |      |                             |                              |\n   | 88   | forwarded                   |                              |\n   |      |                             |                              |\n   | 89   | if-range                    |                              |\n   |      |                             |                              |\n   | 90   | origin                      |                              |\n   |      |                             |                              |\n   | 91   | purpose                     | prefetch                     |\n   |      |                             |                              |\n   | 92   | server                      |                              |\n   |      |                             |                              |\n   | 93   | timing-allow-origin         | *                            |\n   |      |                             |                              |\n   | 94   | upgrade-insecure-requests   | 1                            |\n   |      |                             |                              |\n   | 95   | user-agent                  |                              |\n   |      |                             |                              |\n   | 96   | x-forwarded-for             |                              |\n   |      |                             |                              |\n   | 97   | x-frame-options             | deny                         |\n   |      |                             |                              |\n   | 98   | x-frame-options             | sameorigin                   |"));
            int i = 0;
            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                String strTrim = line.trim();
                if (!patternCompile.matcher(strTrim).matches()) {
                    if (patternCompile2.matcher(strTrim).matches()) {
                        Matcher matcher = patternCompile2.matcher(strTrim);
                        matcher.matches();
                        ((String[]) this.b)[Integer.parseInt(matcher.group(1).trim())] = matcher.group(2).trim();
                        ((String[]) this.c)[Integer.parseInt(matcher.group(1).trim())] = "";
                        i = Integer.parseInt(matcher.group(1).trim());
                    } else if (patternCompile3.matcher(strTrim).matches()) {
                        Matcher matcher2 = patternCompile3.matcher(strTrim);
                        matcher2.matches();
                        ((String[]) this.b)[Integer.parseInt(matcher2.group(1).trim())] = matcher2.group(2).trim();
                        ((String[]) this.c)[Integer.parseInt(matcher2.group(1).trim())] = matcher2.group(3).trim();
                        i = Integer.parseInt(matcher2.group(1).trim());
                    } else {
                        if (!patternCompile4.matcher(strTrim).matches()) {
                            throw new RuntimeException("Internal error: parsing static table definition failed.");
                        }
                        Matcher matcher3 = patternCompile4.matcher(strTrim);
                        matcher3.matches();
                        String strTrim2 = matcher3.group(1).trim();
                        String strTrim3 = matcher3.group(2).trim();
                        int length = strTrim2.length();
                        int iCharCount = 0;
                        while (iCharCount < length) {
                            int iCodePointAt = strTrim2.codePointAt(iCharCount);
                            if (!Character.isWhitespace(iCodePointAt)) {
                                String[] strArr = (String[]) this.b;
                                strArr[i] = strArr[i] + strTrim2;
                                break;
                            }
                            iCharCount += Character.charCount(iCodePointAt);
                        }
                        int length2 = strTrim3.length();
                        int iCharCount2 = 0;
                        while (iCharCount2 < length2) {
                            int iCodePointAt2 = strTrim3.codePointAt(iCharCount2);
                            if (!Character.isWhitespace(iCodePointAt2)) {
                                String[] strArr2 = (String[]) this.c;
                                strArr2[i] = strArr2[i] + strTrim3;
                                break;
                            }
                            iCharCount2 += Character.charCount(iCodePointAt2);
                        }
                    }
                }
            }
        } catch (IOException unused) {
            ore.q("Corrupt library, missing internal resource.");
            throw null;
        }
    }

    public static float d(int i, float[] fArr) {
        float f = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            f += fArr[i2];
        }
        if (i > 0) {
            return f / i;
        }
        return 0.0f;
    }

    public static gpl j(View view) {
        if (view instanceof AdapterView) {
            return new e6f(0);
        }
        if (view instanceof ScrollView) {
            return new e6f(3);
        }
        if (view instanceof RecyclerView) {
            return new f6f((RecyclerView) view);
        }
        if (view instanceof NestedScrollView) {
            return new e6f(2);
        }
        if (view instanceof HorizontalScrollView) {
            return new e6f(1);
        }
        if (view.getParent() instanceof View) {
            return j((View) view.getParent());
        }
        return null;
    }

    public static View k(View view) {
        if ((view instanceof AdapterView) || (view instanceof ScrollView) || (view instanceof RecyclerView) || (view instanceof NestedScrollView) || (view instanceof HorizontalScrollView)) {
            return view;
        }
        if (view.getParent() instanceof View) {
            return k((View) view.getParent());
        }
        return null;
    }

    @Override // defpackage.s8g
    public void a(Object obj) {
        switch (this.a) {
            case 2:
                ((s8g) this.c).a(obj);
                break;
            default:
                ((ug4) this.b).accept(new cj0(0, (Surface) this.c));
                break;
        }
    }

    public c2b b(fka fkaVar) {
        int iT0 = fkaVar.t0();
        x52 x52Var = null;
        Long lValueOf = null;
        float fZ0 = 1.0f;
        boolean zV0 = false;
        boolean zV1 = false;
        for (int i = 0; i < iT0; i++) {
            if (i == 0) {
                int iD0 = fkaVar.D0();
                x52Var = (x52) ((ConcurrentHashMap) ((vn7) this.b).b).get(Integer.valueOf(iD0));
                if (x52Var == null) {
                    ore.q(zo5.h(iD0, "Can't find compact id for "));
                    return null;
                }
            } else if (i == 1) {
                fZ0 = fkaVar.z0();
            } else if (i == 2) {
                zV0 = fkaVar.v0();
            } else if (i != 3) {
                if (i != 4) {
                    fkaVar.x();
                } else {
                    zV1 = fkaVar.v0();
                }
            } else if (fkaVar.y().a() == 3) {
                lValueOf = Long.valueOf(fkaVar.I0());
            }
        }
        if (x52Var != null) {
            return new c2b(x52Var, fZ0, zV0, lValueOf, zV1);
        }
        ore.q("Watch together parse error");
        return null;
    }

    @Override // defpackage.s8g
    public void c(ko5 ko5Var) {
        oo5.d((o72) this.b, ko5Var);
    }

    /* JADX WARN: Code duplicated, block: B:266:0x0622  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean, int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public s4h e(int i, nf2 nf2Var, ArrayList arrayList, ArrayList arrayList2, pd2 pd2Var, int i2, Range range, boolean z) {
        int i3;
        Rect rectH;
        boolean z2;
        pbh pbhVar;
        boolean z3;
        boolean z4;
        LinkedHashMap linkedHashMap;
        boolean z5;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        jch jchVarN;
        String str;
        pbh pbhVar2;
        ArrayList arrayList3 = new ArrayList();
        String strG = nf2Var.g();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            cli cliVar = (cli) it.next();
            yi0 yi0Var = cliVar.j;
            if (yi0Var == null) {
                ore.p("Attached stream spec cannot be null for already attached use cases.");
                return null;
            }
            di2 di2Var = (di2) this.c;
            if (di2Var == null) {
                ore.k("Required value was null.");
                return null;
            }
            int inputFormat = cliVar.i.getInputFormat();
            Size sizeD = cliVar.d();
            if (sizeD == null) {
                ore.p("Attached surface resolution cannot be null for already attached use cases.");
                return null;
            }
            t4h t4hVarK = cliVar.i.K();
            qyj.h("No such camera id in supported combination list: ".concat(strG), di2Var.d.containsKey(strG));
            synchronized (di2Var.c) {
                pbhVar2 = (pbh) di2Var.d.get(strG);
            }
            if (pbhVar2 == null) {
                ore.p("No such camera id in supported combination list: ".concat(strG));
                return null;
            }
            t4h t4hVar = tbh.e;
            tbh tbhVarQ = yr8.q(inputFormat, sizeD, pbhVar2.l(inputFormat), i, 2, t4hVarK);
            int inputFormat2 = cliVar.i.getInputFormat();
            Size sizeD2 = cliVar.d();
            fx5 fx5Var = yi0Var.c;
            ArrayList arrayList4 = new ArrayList();
            if (cliVar instanceof q4h) {
                Iterator it2 = ((q4h) cliVar).v.a.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(((cli) it2.next()).i.L());
                }
            } else {
                arrayList4.add(cliVar.i.L());
            }
            t94 t94Var = yi0Var.f;
            Iterator it3 = it;
            int iIntValue = ((Integer) cliVar.i.b(cmi.a1, 0)).intValue();
            Range range2 = (Range) cliVar.i.b(cmi.b1, yi0.h);
            if (range2 == null) {
                ore.p("Required value was null.");
                return null;
            }
            Boolean bool = (Boolean) cliVar.i.b(cmi.c1, Boolean.FALSE);
            Objects.requireNonNull(bool);
            pg0 pg0Var = new pg0(tbhVarQ, inputFormat2, sizeD2, fx5Var, arrayList4, t94Var, iIntValue, range2, bool.booleanValue(), cliVar.i.N(cliVar.d()));
            arrayList3.add(pg0Var);
            linkedHashMap3.put(pg0Var, cliVar);
            linkedHashMap2.put(cliVar, yi0Var);
            it = it3;
        }
        Pair pair = new Pair(linkedHashMap2, linkedHashMap3);
        Map map = (Map) pair.second;
        HashMap mapW = mi2.w(arrayList, (fmi) pd2Var.b(pd2.P, fmi.a), (ni2) this.b, i2, range);
        String strG2 = nf2Var.g();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        if (arrayList.isEmpty()) {
            i3 = Integer.MAX_VALUE;
        } else {
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            LinkedHashMap linkedHashMap6 = new LinkedHashMap();
            try {
                rectH = nf2Var.h();
            } catch (NullPointerException unused) {
                rectH = null;
            }
            q1j q1jVar = new q1j(nf2Var, rectH != null ? y1i.f(rectH) : null);
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                cli cliVar2 = (cli) it4.next();
                Object obj = mapW.get(cliVar2);
                if (obj == null) {
                    ore.p("Required value was null.");
                    return null;
                }
                ii2 ii2Var = (ii2) obj;
                Iterator it5 = it4;
                cmi cmiVarR = cliVar2.r(nf2Var, ii2Var.a, ii2Var.b);
                linkedHashMap5.put(cmiVarR, cliVar2);
                linkedHashMap6.put(cmiVarR, q1jVar.f(cmiVarR));
                it4 = it5;
            }
            int iB = c2m.b(arrayList, new bad(mapW, 17, nf2Var));
            di2 di2Var2 = (di2) this.c;
            if (di2Var2 == null) {
                ore.k("Required value was null.");
                return null;
            }
            ArrayList arrayList5 = new ArrayList(map.keySet());
            Iterator it6 = arrayList.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    z2 = false;
                    break;
                }
                cli cliVar3 = (cli) it6.next();
                if (cliVar3 != null && c2m.c(cliVar3)) {
                    z2 = true;
                    break;
                }
            }
            qyj.h("No such camera id in supported combination list: ".concat(strG2), di2Var2.d.containsKey(strG2));
            synchronized (di2Var2.c) {
                pbhVar = (pbh) di2Var2.d.get(strG2);
            }
            if (pbhVar == null) {
                ore.p("No such camera id in supported combination list: ".concat(strG2));
                return null;
            }
            fo5 fo5Var = pbhVar.y;
            synchronized (fo5Var.c) {
                fo5Var.f = fo5Var.a();
            }
            if (pbhVar.v == null) {
                pbhVar.b();
            } else {
                Size sizeC = pbhVar.y.c();
                ej0 ej0Var = pbhVar.v;
                Size size = (ej0Var != null ? ej0Var : null).a;
                LinkedHashMap linkedHashMap7 = (ej0Var != null ? ej0Var : null).b;
                LinkedHashMap linkedHashMap8 = (ej0Var != null ? ej0Var : null).d;
                Size size2 = (ej0Var != null ? ej0Var : null).e;
                if (ej0Var == null) {
                    ej0Var = null;
                }
                pbhVar.v = new ej0(size, linkedHashMap7, sizeC, linkedHashMap8, size2, ej0Var.f, (ej0Var != null ? ej0Var : null).g, (ej0Var != null ? ej0Var : null).h, (ej0Var != null ? ej0Var : null).i);
            }
            Range range3 = qv7.f;
            Set setKeySet = linkedHashMap6.keySet();
            ArrayList arrayList6 = new ArrayList(yw3.W0(arrayList5, 10));
            Iterator it7 = arrayList5.iterator();
            while (it7.hasNext()) {
                arrayList6.add(Integer.valueOf(((pg0) it7.next()).g));
            }
            ArrayList arrayList7 = new ArrayList(yw3.W0(setKeySet, 10));
            Iterator it8 = setKeySet.iterator();
            while (it8.hasNext()) {
                Integer num = (Integer) ((cmi) it8.next()).b(cmi.a1, 0);
                num.getClass();
                arrayList7.add(num);
            }
            ArrayList arrayListG1 = ww3.G1(arrayList7, arrayList6);
            if (arrayListG1.isEmpty()) {
                z3 = false;
                break;
            }
            Iterator it9 = arrayListG1.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    z3 = false;
                    break;
                }
                if (((Number) it9.next()).intValue() == 1) {
                    z3 = true;
                    break;
                }
            }
            if (z3 && !arrayListG1.isEmpty()) {
                Iterator it10 = arrayListG1.iterator();
                while (it10.hasNext()) {
                    if (((Number) it10.next()).intValue() != 1) {
                        ore.p("All sessionTypes should be high-speed when any of them is high-speed");
                        return null;
                    }
                }
            }
            if (z3) {
                qv7 qv7Var = pbhVar.C;
                qv7Var.getClass();
                List listA = qv7.a(ww3.T1(linkedHashMap6.values()));
                ArrayList arrayList8 = new ArrayList();
                Iterator it11 = listA.iterator();
                while (it11.hasNext()) {
                    Object next = it11.next();
                    boolean z6 = z2;
                    Iterator it12 = it11;
                    if (((List) qv7Var.e.getValue()).contains((Size) next)) {
                        arrayList8.add(next);
                    }
                    z2 = z6;
                    it11 = it12;
                }
                z4 = z2;
                LinkedHashMap linkedHashMap9 = new LinkedHashMap(wm9.P0(linkedHashMap6.size()));
                Iterator it13 = linkedHashMap6.entrySet().iterator();
                while (it13.hasNext()) {
                    Map.Entry entry = (Map.Entry) it13.next();
                    Object key = entry.getKey();
                    List list = (List) entry.getValue();
                    ArrayList arrayList9 = new ArrayList();
                    Iterator it14 = list.iterator();
                    while (it14.hasNext()) {
                        Iterator it15 = it13;
                        Object next2 = it14.next();
                        Iterator it16 = it14;
                        if (arrayList8.contains((Size) next2)) {
                            arrayList9.add(next2);
                        }
                        it13 = it15;
                        it14 = it16;
                    }
                    linkedHashMap9.put(key, arrayList9);
                }
                linkedHashMap = linkedHashMap9;
            } else {
                z4 = z2;
                linkedHashMap = linkedHashMap6;
            }
            List<cmi> listT1 = ww3.T1(linkedHashMap.keySet());
            ArrayList arrayList10 = new ArrayList();
            ArrayList arrayList11 = new ArrayList();
            Iterator it17 = listT1.iterator();
            while (it17.hasNext()) {
                Integer num2 = (Integer) ((cmi) it17.next()).b(cmi.Z0, 0);
                num2.getClass();
                if (!arrayList11.contains(num2)) {
                    arrayList11.add(num2);
                }
            }
            if (arrayList11.size() > 1) {
                Collections.sort(arrayList11);
            }
            Collections.reverse(arrayList11);
            Iterator it18 = arrayList11.iterator();
            while (it18.hasNext()) {
                int iIntValue2 = ((Number) it18.next()).intValue();
                for (cmi cmiVar : listT1) {
                    Iterator it19 = it18;
                    if (iIntValue2 == ((Integer) cmiVar.b(cmi.Z0, 0)).intValue()) {
                        arrayList10.add(Integer.valueOf(listT1.indexOf(cmiVar)));
                    }
                    it18 = it19;
                }
            }
            LinkedHashMap linkedHashMapM = pbhVar.B.m(arrayList5, listT1, arrayList10);
            if (tvj.f(3, "CXCP")) {
                Log.d("CXCP", "resolvedDynamicRanges = " + linkedHashMapM);
            }
            Iterator it20 = arrayList5.iterator();
            while (true) {
                if (!it20.hasNext()) {
                    Iterator it21 = linkedHashMap.keySet().iterator();
                    while (true) {
                        if (!it21.hasNext()) {
                            z5 = false;
                            break;
                        }
                        if (((cmi) it21.next()).getInputFormat() == 4101) {
                        }
                    }
                } else if (((pg0) it20.next()).b == 4101) {
                }
                z5 = true;
                break;
            }
            Iterator it22 = arrayList5.iterator();
            Boolean boolValueOf = null;
            while (it22.hasNext()) {
                boolean z7 = ((pg0) it22.next()).i;
                Iterator it23 = it22;
                if (boolValueOf != null && !boolValueOf.equals(Boolean.valueOf(z7))) {
                    ore.k("All isStrictFpsRequired should be the same");
                    return null;
                }
                boolValueOf = Boolean.valueOf(z7);
                it22 = it23;
            }
            Iterator it24 = listT1.iterator();
            while (it24.hasNext()) {
                Iterator it25 = it24;
                LinkedHashMap linkedHashMap10 = linkedHashMapM;
                Boolean bool2 = (Boolean) ((cmi) it24.next()).b(cmi.c1, Boolean.FALSE);
                Objects.requireNonNull(bool2);
                if (boolValueOf != null && !boolValueOf.equals(bool2)) {
                    ore.k("All isStrictFpsRequired should be the same");
                    return null;
                }
                boolValueOf = bool2;
                linkedHashMapM = linkedHashMap10;
                it24 = it25;
            }
            LinkedHashMap linkedHashMap11 = linkedHashMapM;
            boolean zBooleanValue = boolValueOf != null ? boolValueOf.booleanValue() : false;
            Range rangeM = yi0.h;
            Iterator it26 = arrayList5.iterator();
            while (it26.hasNext()) {
                rangeM = pbh.m(((pg0) it26.next()).h, rangeM, zBooleanValue);
            }
            Iterator it27 = arrayList10.iterator();
            while (it27.hasNext()) {
                rangeM = pbh.m((Range) ((cmi) listT1.get(((Number) it27.next()).intValue())).b(cmi.b1, yi0.h), rangeM, zBooleanValue);
                arrayList5 = arrayList5;
                listT1 = listT1;
            }
            List list2 = listT1;
            ArrayList arrayList12 = arrayList5;
            boolean zBooleanValue2 = Boolean.valueOf(zBooleanValue).booleanValue();
            boolean z8 = iB == 4;
            if (tvj.f(3, "CXCP")) {
                Log.d("CXCP", "getSuggestedStreamSpecifications: isPreviewStabilizationSupported = " + pbhVar.t + ", isFeatureComboInvocation = " + z);
            }
            if (z8 && !pbhVar.t && z) {
                ore.p("Preview stabilization is not supported by the camera.");
                return null;
            }
            Iterator it28 = linkedHashMap11.values().iterator();
            while (true) {
                if (!it28.hasNext()) {
                    i4 = 8;
                    break;
                }
                if (((fx5) it28.next()).b == 10) {
                    i4 = 10;
                    break;
                }
            }
            boolean z9 = z5;
            pbh pbhVar3 = pbhVar;
            Range range4 = rangeM;
            obh obhVar = new obh(i, i4, z4, iB, z9, z3, z, false, range4, zBooleanValue2);
            pbhVar3.q(obhVar);
            Collection collectionValues = linkedHashMap11.values();
            if (z) {
                ?? Contains = collectionValues.contains(fx5.e);
                Integer num3 = (Integer) range4.getUpper();
                if (num3 != null && num3.intValue() == 60) {
                    i5 = Contains;
                    i5 = Contains;
                    i5 = Contains + 1;
                }
                if (iB != 3) {
                    i6 = i5;
                    if (iB == 4) {
                        i6 = i5 + 1;
                    }
                } else {
                    i6 = i5 + 1;
                }
                if (z9) {
                    i6++;
                }
                i7 = 1;
                i8 = i6 > 1 ? 2 : i6 == 1 ? 3 : 1;
            } else {
                i8 = 1;
                i7 = 1;
            }
            if (tvj.f(3, "CXCP")) {
                if (i8 == i7) {
                    str = "WITHOUT_FEATURE_COMBO";
                } else if (i8 != 2) {
                    str = i8 != 3 ? "null" : "WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT";
                } else {
                    str = "WITH_FEATURE_COMBO";
                }
                Log.d("CXCP", "resolveSpecsByCheckingMethod: checkingMethod = ".concat(str));
            }
            int iD = qt4.D(i8);
            if (iD == 0) {
                obh obhVarA = obh.a(obhVar, false, null, 895);
                pbhVar3.q(obhVarA);
                jchVarN = pbhVar3.n(obhVarA, arrayList12, linkedHashMap, list2, arrayList10, linkedHashMap11);
            } else if (iD == 1) {
                if (z) {
                    Range range5 = yi0.h;
                }
                obh obhVarA2 = obh.a(obhVar, true, range4, 639);
                pbhVar3.q(obhVarA2);
                jchVarN = pbhVar3.n(obhVarA2, arrayList12, linkedHashMap, list2, arrayList10, linkedHashMap11);
            } else {
                if (iD != 2) {
                    ore.o();
                    return null;
                }
                try {
                    obh obhVarA3 = obh.a(obhVar, false, null, 895);
                    pbhVar3.q(obhVarA3);
                    try {
                        jchVarN = pbhVar3.n(obhVarA3, arrayList12, linkedHashMap, list2, arrayList10, linkedHashMap11);
                    } catch (IllegalArgumentException e) {
                        e = e;
                        pbhVar3 = pbhVar3;
                        if (tvj.f(3, "CXCP")) {
                            Log.d("CXCP", "Failed to find a supported combination without feature combo, trying again with feature combo", e);
                        }
                        obh obhVarA4 = obh.a(obhVar, true, null, 895);
                        pbhVar3.q(obhVarA4);
                        jchVarN = pbhVar3.n(obhVarA4, arrayList12, linkedHashMap, list2, arrayList10, linkedHashMap11);
                    }
                } catch (IllegalArgumentException e2) {
                    e = e2;
                }
            }
            LinkedHashMap linkedHashMap12 = jchVarN.a;
            LinkedHashMap linkedHashMap13 = jchVarN.b;
            i3 = jchVarN.c;
            for (Map.Entry entry2 : linkedHashMap5.entrySet()) {
                Object value = entry2.getValue();
                Object obj2 = linkedHashMap12.get(entry2.getKey());
                if (obj2 == null) {
                    ore.p("Required value was null.");
                    return null;
                }
                linkedHashMap4.put(value, obj2);
            }
            for (Map.Entry entry3 : linkedHashMap13.entrySet()) {
                if (map.containsKey(entry3.getKey())) {
                    Object obj3 = map.get(entry3.getKey());
                    if (obj3 == null) {
                        ore.p("Required value was null.");
                        return null;
                    }
                    linkedHashMap4.put(obj3, entry3.getValue());
                }
            }
        }
        return new s4h(i3, wm9.T0((Map) pair.first, linkedHashMap4));
    }

    @Override // defpackage.hch
    public void f(dj0 dj0Var) {
        ((t0j) this.c).b();
        ug7 ug7Var = (((fx5) this.b).a() && dj0Var.d) ? ug7.c : ug7.b;
        String str = ((t0j) this.c).a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "onTransformationInfoUpdate, transformationInfo=" + dj0Var + ", input format=" + ug7Var, null);
            }
        }
        h1j h1jVar = ((t0j) this.c).j;
        if (h1jVar == null) {
            ore.p("Required value was null.");
            return;
        }
        xg7.d((AtomicBoolean) h1jVar.b, true);
        xg7.c((Thread) h1jVar.d);
        if (((ug7) h1jVar.m) != ug7Var) {
            h1jVar.m = ug7Var;
            h1jVar.u(h1jVar.a);
        }
    }

    public void g() {
        int[] iArr = (int[]) this.b;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.c = null;
    }

    @Override // defpackage.kq4
    public Object h(Task task) {
        Bundle bundle;
        ove oveVar = (ove) this.b;
        Bundle bundle2 = (Bundle) this.c;
        oveVar.getClass();
        return (task.j() && (bundle = (Bundle) task.h()) != null && bundle.containsKey("google.messenger")) ? oveVar.a(bundle2).m(jm5.d, dul.p) : task;
    }

    public void i(int i) {
        int[] iArr = (int[]) this.b;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public Throwable l() {
        return (Throwable) this.c;
    }

    public void m(int i, int i2) {
        int[] iArr = (int[]) this.b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        i(i3);
        int[] iArr2 = (int[]) this.b;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.b, i, i3, -1);
        ArrayList arrayList = (ArrayList) this.c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ngg nggVar = (ngg) ((ArrayList) this.c).get(size);
            int i4 = nggVar.a;
            if (i4 >= i) {
                nggVar.a = i4 + i2;
            }
        }
    }

    public void n(int i, int i2) {
        int[] iArr = (int[]) this.b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        i(i3);
        int[] iArr2 = (int[]) this.b;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.b;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ngg nggVar = (ngg) ((ArrayList) this.c).get(size);
            int i4 = nggVar.a;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((ArrayList) this.c).remove(size);
                } else {
                    nggVar.a = i4 - i2;
                }
            }
        }
    }

    public void o(JSONObject jSONObject) {
        use useVar;
        wmc wmcVar = (wmc) this.c;
        wmcVar.getClass();
        try {
            useVar = new use(yt1.a(jSONObject.getString("initiatorId")), f6m.d(jSONObject, "sharedUrl"), iw8.k(jSONObject));
        } catch (JSONException e) {
            wmcVar.a.logException("UrlSharingParser", "Can't parse url sharing", e);
            useVar = null;
        }
        if (useVar == null) {
            return;
        }
        zki zkiVar = (zki) this.b;
        dnf dnfVar = useVar.c;
        String str = useVar.b;
        zkiVar.onUrlSharingInfoUpdated(new o42(dnfVar, str != null ? new c6g(useVar.a, str) : null));
    }

    @Override // defpackage.s8g
    public void onError(Throwable th) {
        ((s8g) this.c).onError(th);
    }

    @Override // defpackage.kg7
    public void onFailure(Throwable th) {
        qyj.l("Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th, th instanceof gch);
        ((ug4) this.b).accept(new cj0(1, (Surface) this.c));
    }

    public fcj p(fka fkaVar) {
        int iT0 = fkaVar.t0();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < iT0; i++) {
            try {
                arrayList.add(b(fkaVar));
            } catch (Throwable th) {
                ((y3e) this.c).log("WatchTogetherUpdateParser", "Can't parse video state update " + th);
            }
        }
        return new fcj(new d2b(arrayList));
    }

    public void q(Boolean bool) {
        this.c = bool;
    }

    public void r() {
        this.b = zul.CUSTOM;
    }

    public zsl s() {
        return new zsl(this);
    }

    public String toString() {
        switch (this.a) {
            case 7:
                Map map = (Map) this.b;
                Throwable th = (Throwable) this.c;
                return "ThreadDump(threadsCount=" + map + ", allStackTraces=" + (th != null ? gm0.N(th) : null) + ")";
            case 12:
                return String.format("%s|%s", (e8k) this.b, (List) this.c);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ h6f(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public h6f(vn7 vn7Var, y3e y3eVar) {
        this.a = 11;
        vn7Var.getClass();
        y3eVar.getClass();
        this.b = vn7Var;
        this.c = y3eVar;
    }

    public h6f(zki zkiVar, wmc wmcVar) {
        this.a = 9;
        zkiVar.getClass();
        wmcVar.getClass();
        this.b = zkiVar;
        this.c = wmcVar;
    }

    public h6f(v30 v30Var, View view) {
        this.a = 0;
        this.b = view;
    }

    public h6f(String str) {
        this.a = 6;
        this.b = str;
        CharsetDecoder charsetDecoderNewDecoder = StandardCharsets.UTF_8.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        this.c = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
    }

    public /* synthetic */ h6f(int i) {
        this.a = i;
    }

    public h6f(l5b l5bVar) {
        this.a = 8;
        this.c = null;
        this.b = l5bVar;
        l5bVar.h = this;
    }

    public h6f(ni2 ni2Var) {
        this.a = 4;
        this.b = ni2Var;
        this.c = null;
    }

    public h6f(t0j t0jVar, fx5 fx5Var) {
        this.a = 10;
        this.c = t0jVar;
        this.b = fx5Var;
    }
}
