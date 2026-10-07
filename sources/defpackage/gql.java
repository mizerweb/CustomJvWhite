package defpackage;

import java.io.File;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gql {
    public static d25 a(File file, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("param_dump_path", file.getPath());
        linkedHashMap.put("param_tag", str);
        d25 d25Var = new d25(linkedHashMap);
        f55.y(d25Var);
        return d25Var;
    }

    public static final fdc b(a35 a35Var) {
        return new fdc(a35Var.a, a35.b(a35Var.c), a35Var.e, a35Var.f, a35Var.g, a35Var.i);
    }
}
