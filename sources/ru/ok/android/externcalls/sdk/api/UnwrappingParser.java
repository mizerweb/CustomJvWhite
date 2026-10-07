package ru.ok.android.externcalls.sdk.api;

import defpackage.hu8;
import defpackage.vu8;
import defpackage.zo5;
import java.io.IOException;
import ru.ok.android.api.json.JsonParseException;

/* JADX INFO: loaded from: classes3.dex */
public final class UnwrappingParser<T> implements hu8 {
    private final String fieldName;
    private final hu8 valueParser;

    public UnwrappingParser(String str, hu8 hu8Var) {
        this.fieldName = str;
        this.valueParser = hu8Var;
    }

    @Override // defpackage.hu8
    public T parse(vu8 vu8Var) throws JsonParseException, IOException {
        vu8Var.p();
        T t = null;
        while (vu8Var.hasNext()) {
            if (this.fieldName.equals(vu8Var.name())) {
                t = (T) this.valueParser.parse(vu8Var);
            }
        }
        vu8Var.t();
        if (t != null) {
            return t;
        }
        throw new JsonParseException(zo5.w(new StringBuilder("\""), this.fieldName, "\" not found"));
    }
}
