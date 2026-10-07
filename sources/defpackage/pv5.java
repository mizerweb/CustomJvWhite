package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class pv5 {
    public final File a;
    public final File b;
    public final File c;
    public final File d;
    public volatile ntl e;
    public final Object f;

    public pv5(File file) {
        this.a = file;
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            c.p(file, " not in directory", "File ");
            throw null;
        }
        this.b = parentFile;
        this.c = lu6.q0(parentFile, file.getName() + ".tmp");
        this.d = lu6.q0(parentFile, file.getName() + ".taken");
        this.e = nv5.a;
        this.f = new Object();
    }

    public final void a(int i) {
        b(Collections.singletonList(new rv5("non_fatal", "max_non_fatals_per_session_reached", i)));
    }

    public final void b(Collection collection) {
        List listC;
        if (collection.isEmpty()) {
            return;
        }
        synchronized (this.f) {
            ntl ntlVar = this.e;
            if ((ntlVar instanceof ov5) && collection == ((List) ((ov5) ntlVar).a.get())) {
                this.b.mkdirs();
                this.d.renameTo(this.a);
                this.e = new mv5((List) collection);
                return;
            }
            ntl ntlVar2 = this.e;
            if (ntlVar2 instanceof nv5) {
                listC = c();
            } else if (ntlVar2 instanceof mv5) {
                listC = ((mv5) ntlVar2).a;
            } else {
                if (!(ntlVar2 instanceof ov5)) {
                    throw new NoWhenBranchMatchedException();
                }
                listC = r66.a;
            }
            List listM = so2.M(listC, collection);
            d(listM);
            this.e = new mv5(listM);
        }
    }

    public final List c() {
        File file = this.a;
        boolean zExists = file.exists();
        r66 r66Var = r66.a;
        if (zExists) {
            try {
                JSONArray jSONArray = new JSONArray(lu6.p0(file, pt2.a));
                c79 c79VarW = yab.w();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    c79VarW.add(new rv5(jSONObject.getString("event"), jSONObject.getString("reason"), jSONObject.getInt("count")));
                }
                return yab.j(c79VarW);
            } catch (IOException e) {
                Log.e("Tracer", "Couldn't read " + file, e);
                return r66Var;
            } catch (JSONException e2) {
                Log.e("Tracer", "Couldn't read " + file, e2);
                try {
                    sb8.o(file);
                } catch (IOException unused) {
                    Log.e("Tracer", "Couldn't delete " + file);
                }
            }
        }
        return r66Var;
    }

    public final void d(List list) throws JSONException {
        File file = this.c;
        File file2 = this.a;
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            rv5 rv5Var = (rv5) it.next();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event", rv5Var.a);
            jSONObject.put("reason", rv5Var.b);
            jSONObject.put("count", rv5Var.c);
            jSONArray.put(jSONObject);
        }
        String string = jSONArray.toString();
        try {
            sb8.U(this.b);
            lu6.s0(file, string);
            sb8.e0(file, file2);
        } catch (IOException e) {
            Log.e("Tracer", "Couldn't write " + file2, e);
            try {
                sb8.o(file2);
            } catch (IOException unused) {
                Log.e("Tracer", "Couldn't delete " + file2);
            }
        }
    }

    public final Collection e() {
        List listC;
        ntl ntlVar = this.e;
        if ((!(ntlVar instanceof mv5) || !((mv5) ntlVar).a.isEmpty()) && !(ntlVar instanceof ov5)) {
            synchronized (this.f) {
                try {
                    ntl ntlVar2 = this.e;
                    if (ntlVar2 instanceof nv5) {
                        listC = c();
                    } else {
                        if (!(ntlVar2 instanceof mv5)) {
                            if (!(ntlVar2 instanceof ov5)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return r66.a;
                        }
                        listC = ((mv5) ntlVar2).a;
                    }
                    if (listC.isEmpty()) {
                        this.e = new mv5(r66.a);
                    } else {
                        this.a.renameTo(this.d);
                        this.e = new ov5(listC);
                    }
                    return listC;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return r66.a;
    }
}
