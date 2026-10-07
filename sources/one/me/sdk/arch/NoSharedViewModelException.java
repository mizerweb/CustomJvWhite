package one.me.sdk.arch;

import defpackage.t3f;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lone/me/sdk/arch/NoSharedViewModelException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "arch"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NoSharedViewModelException extends IllegalStateException {
    public NoSharedViewModelException(t3f t3fVar, Class cls, String str) {
        super("no shared viewmodel for scope " + t3fVar + ", vm class=" + cls.getName() + ". " + str);
    }
}
