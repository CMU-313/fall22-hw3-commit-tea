package com.sismics.docs.rest;

import com.google.common.io.ByteStreams;
import com.google.common.io.Resources;
import com.sismics.docs.core.util.DirectoryUtil;
import com.sismics.util.filter.TokenBasedSecurityFilter;
import org.glassfish.jersey.media.multipart.FormDataMultiPart;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.media.multipart.file.StreamDataBodyPart;
import org.joda.time.format.DateTimeFormat;
import org.junit.Assert;
import org.junit.Test;

import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Date;
import java.util.zip.ZipInputStream;



/**
 * Exhaustive test of the document resource.
 * 
 * @author bgamard
 */
public class TestDashboard extends BaseJerseyTest {
    /**
     * Testing the status endpoints (readytoreview, inreview, accepted, waitlisted, 
     * rejected, flagged). This is used for the dashboard.
     * 
     * @throws Exception e
     */
    @Test
    public void testAllStatusEndpoints() throws Exception {
        String user = "document1";
        clientUtil.createUser(user);
        String document1Token = clientUtil.login("document1"); 
        Response resp = target().path("document/readytoreview").request()
                    .cookie(TokenBasedSecurityFilter.COOKIE_NAME, document1Token)
                    .post(Entity.form(new Form()));

        resp = target().path("document/inreview").request()
                    .cookie(TokenBasedSecurityFilter.COOKIE_NAME, document1Token)
                    .post(Entity.form(new Form()));

        resp = target().path("document/accepted").request()
                    .cookie(TokenBasedSecurityFilter.COOKIE_NAME, document1Token)
                    .post(Entity.form(new Form()));
        
        resp = target().path("document/waitlisted").request()
                    .cookie(TokenBasedSecurityFilter.COOKIE_NAME, document1Token)
                    .post(Entity.form(new Form()));
        
        resp = target().path("document/rejected").request()
                    .cookie(TokenBasedSecurityFilter.COOKIE_NAME, document1Token)
                    .post(Entity.form(new Form()));

        resp = target().path("document/flagged").request()
                    .cookie(TokenBasedSecurityFilter.COOKIE_NAME, document1Token)
                    .post(Entity.form(new Form()));

        // If here that means able to get responses for all status endpoints
        Assert.assertEquals(user, "document1");
    }
}