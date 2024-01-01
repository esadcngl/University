﻿namespace CodeFirst.Migrations
{
    using System;
    using System.Data.Entity.Migrations;
    
    public partial class DeleteMusterisTable : DbMigration
    {
        public override void Up()
        {
            DropTable("dbo.Musteris");
        }
        
        public override void Down()
        {
            CreateTable(
                "dbo.Musteris",
                c => new
                    {
                        MusterID = c.Int(nullable: false, identity: true),
                        MusteriAD = c.String(),
                        MusteriSoyadı = c.String(),
                        MusteriSehir = c.String(),
                    })
                .PrimaryKey(t => t.MusterID);
            
        }
    }
}
