package com.facebook.imagepipeline.decoder;

import defpackage.p76;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/imagepipeline/decoder/DecodeException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DecodeException extends RuntimeException {
    public final p76 a;

    public DecodeException(String str, p76 p76Var) {
        super(str);
        this.a = p76Var;
    }
}
