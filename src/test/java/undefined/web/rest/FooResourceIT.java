package com.carara.firstapp.web.rest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.carara.firstapp.IntegrationTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * Test class for the FooResource REST controller.
 *
 * @see FooResource
 */
@IntegrationTest
class FooResourceIT {

    private MockMvc restMockMvc;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);

        FooResource fooResource = new FooResource();
        restMockMvc = MockMvcBuilders.standaloneSetup(fooResource).build();
    }

    /**
     * Test getFoo
     */
    @Test
    void testGetFoo() throws Exception {
        restMockMvc.perform(get("/api/foo/get-foo")).andExpect(status().isOk());
    }

    /**
     * Test postFoo
     */
    @Test
    void testPostFoo() throws Exception {
        restMockMvc.perform(post("/api/foo/post-foo")).andExpect(status().isOk());
    }

    /**
     * Test deleteFoo
     */
    @Test
    void testDeleteFoo() throws Exception {
        restMockMvc.perform(delete("/api/foo/delete-foo")).andExpect(status().isOk());
    }

    /**
     * Test getAllFoo
     */
    @Test
    void testGetAllFoo() throws Exception {
        restMockMvc.perform(get("/api/foo/get-all-foo")).andExpect(status().isOk());
    }

    /**
     * Test updateFoo
     */
    @Test
    void testUpdateFoo() throws Exception {
        restMockMvc.perform(put("/api/foo/update-foo")).andExpect(status().isOk());
    }
}
