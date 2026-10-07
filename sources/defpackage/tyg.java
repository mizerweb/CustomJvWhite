package defpackage;

import kotlin.collections.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tyg {
    public static final u8b a;

    static {
        ryg[] rygVarArr = {new pyg(new dy8(0.5f, 0.25f, 0.6f, 0.1f, 0.0f), "https://max.ru/gigachat", (byte) 0), new pyg(new dy8(0.5f, 0.4f, 0.6f, 0.1f, 0.0f), "https://example.com/unverified", (byte) 0), new pyg(new dy8(0.5f, 0.55f, 0.6f, 0.1f, 0.0f), "https://example.com/unsafe", (byte) 1), new pyg(new dy8(0.5f, 0.7f, 0.6f, 0.1f, 0.0f), "https://example.com/whitelisted", (byte) 2)};
        Object[] objArr = cqb.a;
        u8b u8bVar = new u8b(4);
        int i = u8bVar.b + 4;
        Object[] objArr2 = u8bVar.a;
        if (objArr2.length < i) {
            u8bVar.m(objArr2, i);
        }
        a.S0(rygVarArr, u8bVar.a, u8bVar.b, 0, 0, 12);
        u8bVar.b += 4;
        a = u8bVar;
    }
}
