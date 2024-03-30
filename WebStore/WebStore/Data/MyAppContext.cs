﻿using Microsoft.EntityFrameworkCore;
using WebStore.Data.Entities;

namespace WebStore.Data
{
    public class MyAppContext : DbContext
    {
        public MyAppContext(DbContextOptions<MyAppContext> options) 
            :base(options) { }

        public DbSet<CategoryEntity> Categories { get; set; }
    }
}
