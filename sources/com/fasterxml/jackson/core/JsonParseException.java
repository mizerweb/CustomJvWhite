package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.exc.StreamReadException;
import defpackage.iu8;

/* JADX INFO: loaded from: classes2.dex */
public class JsonParseException extends StreamReadException {
    public JsonParseException(iu8 iu8Var, String str) {
        super(str, iu8Var == null ? null : iu8Var.l(), null);
    }
}
